import com.fortify.schema.fws.GenerateReportRequest;
import com.fortify.schema.fws.GenerateReportResponse;
import com.fortify.schema.fws.Services;
import com.fortify.schema.fws.ServicesService;

import javax.xml.ws.BindingProvider;

import java.util.Map;

public class Test {
  private final String login;
  private final String password;
  private Services service;

  public Test(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public GenerateReportResponse generateReport(GenerateReportRequest request) {
    return getService().generateReport(request);
  }

  private Services getService() {
    if (null == service) {
      service = new ServicesService().getServicesSoap11();

      Map<String, Object> context = ((BindingProvider) service).getRequestContext();
      context.put(BindingProvider.USERNAME_PROPERTY, login);
      context.put(BindingProvider.PASSWORD_PROPERTY, password);

      // Map<String, List<String>> headers = new HashMap<String, List<String>>();
      // headers.put("Username", Arrays.asList(login));
      // headers.put("Password", Arrays.asList(password));
      // req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    }
    return service;
  }
}
