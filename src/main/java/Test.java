import com.fortify.schema.fws.GenerateReportRequest;
import com.fortify.schema.fws.GenerateReportResponse;
import com.fortify.schema.fws.Services;
import com.fortify.schema.fws.ServicesService;

public class Test {
  private final String login;
  private final String password;
  private Services trthApiService;

  public Test(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public GenerateReportResponse cancelRequest(GenerateReportRequest request) {
    return getService().generateReport(request);
  }

  protected Services getService() {
    if (null == trthApiService) {
      trthApiService = new ServicesService().getServicesSoap11();
    }
    return trthApiService;
  }
}
