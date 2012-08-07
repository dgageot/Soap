import com.fortify.schema.fws.GenerateReportRequest;
import com.fortify.schema.fws.GenerateReportResponse;
import com.fortify.schema.fws.Services;
import com.fortify.schema.fws.ServicesService;

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
    }
    return service;
  }
}
