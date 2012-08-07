
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.ActiveProjectVersionListResponse;
import com.fortify.schema.fws.ActivityListResponse;
import com.fortify.schema.fws.ActivityTemplateAssignmentRuleListResponse;
import com.fortify.schema.fws.AlertDefinitionListResponse;
import com.fortify.schema.fws.AlertDefinitionResponse;
import com.fortify.schema.fws.AnalysisPayloadDownloadResponse;
import com.fortify.schema.fws.AnalysisPayloadUploadResponse;
import com.fortify.schema.fws.ArchiveRuntimeEventResponse;
import com.fortify.schema.fws.ArtifactDownloadResponse;
import com.fortify.schema.fws.AuditViewResponse;
import com.fortify.schema.fws.AuthenticationTokenListResponse;
import com.fortify.schema.fws.BatchCreateUpdateAndAssignCustomTagsResponse;
import com.fortify.schema.fws.CheckCurrentUserPermissionResponse;
import com.fortify.schema.fws.CloudCtrlUrlResponse;
import com.fortify.schema.fws.CloudOneTimeJobTokenRequest;
import com.fortify.schema.fws.CreateAuditSessionResponse;
import com.fortify.schema.fws.CreateOrUpdateProjectMetaDataValuesListRequest;
import com.fortify.schema.fws.CurrentUserPermissionTemplateListResponse;
import com.fortify.schema.fws.CustomTagListResponse;
import com.fortify.schema.fws.DateResponse;
import com.fortify.schema.fws.DeleteResponse;
import com.fortify.schema.fws.DescriptionAndRecommendationResponse;
import com.fortify.schema.fws.DocumentArtifactDownloadResponse;
import com.fortify.schema.fws.DocumentDefinitionListResponse;
import com.fortify.schema.fws.DocumentTemplateDownloadResponse;
import com.fortify.schema.fws.EquationVariableListResponse;
import com.fortify.schema.fws.FindLdapUserDnResponse;
import com.fortify.schema.fws.FprDownloadResponse;
import com.fortify.schema.fws.GenerateReportResponse;
import com.fortify.schema.fws.GenericResponse;
import com.fortify.schema.fws.GetAuthenticationTokenResponse;
import com.fortify.schema.fws.GroupingValuesResponse;
import com.fortify.schema.fws.IssueListResponse;
import com.fortify.schema.fws.JobStatusResponse;
import com.fortify.schema.fws.LicenseCapabilityListResponse;
import com.fortify.schema.fws.MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest;
import com.fortify.schema.fws.MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest;
import com.fortify.schema.fws.MeasurementHistoryListForSnapshotRequest;
import com.fortify.schema.fws.MeasurementHistoryListRequest;
import com.fortify.schema.fws.MeasurementHistoryListResponse;
import com.fortify.schema.fws.MostRecentMeasurementHistoryListRequest;
import com.fortify.schema.fws.MostRecentVariableHistoryListRequest;
import com.fortify.schema.fws.PerformanceIndicatorListResponse;
import com.fortify.schema.fws.PermissionTemplateListResponse;
import com.fortify.schema.fws.PersonaListResponse;
import com.fortify.schema.fws.ProjectListResponse;
import com.fortify.schema.fws.ProjectMetaDataDefinitionResponse;
import com.fortify.schema.fws.ProjectMetaDataDefinitionsListResponse;
import com.fortify.schema.fws.ProjectMetaDataValueResponse;
import com.fortify.schema.fws.ProjectMetaDataValuesListResponse;
import com.fortify.schema.fws.ProjectTemplateDownloadResponse;
import com.fortify.schema.fws.ProjectTemplateListResponse;
import com.fortify.schema.fws.ProjectTemplateUploadResponse;
import com.fortify.schema.fws.RegisteredLdapEntityListResponse;
import com.fortify.schema.fws.ReportDefinitionListResponse;
import com.fortify.schema.fws.ReportDefinitionResponse;
import com.fortify.schema.fws.RequirementTemplateListResponse;
import com.fortify.schema.fws.RuntimeApplicationListResponse;
import com.fortify.schema.fws.RuntimeEventArchiveDownloadResponse;
import com.fortify.schema.fws.RuntimeEventArchiveListResponse;
import com.fortify.schema.fws.SavedReportByIdResponse;
import com.fortify.schema.fws.SavedReportDownloadResponse;
import com.fortify.schema.fws.SavedReportListForProjectVersionRequest;
import com.fortify.schema.fws.SavedReportListForProjectVersionResponse;
import com.fortify.schema.fws.SavedReportListResponse;
import com.fortify.schema.fws.SearchLdapResponse;
import com.fortify.schema.fws.SnapshotListResponse;
import com.fortify.schema.fws.SnapshotMostRecentFirstDateRequest;
import com.fortify.schema.fws.SnapshotsForProjectVersionAndDateRequest;
import com.fortify.schema.fws.SnapshotsForProjectVersionAndPriorToDateRequest;
import com.fortify.schema.fws.SnapshotsForProjectVersionRequest;
import com.fortify.schema.fws.SubmitBugResponse;
import com.fortify.schema.fws.TemplateAssignmentRuleListResponse;
import com.fortify.schema.fws.TraceNodesResponse;
import com.fortify.schema.fws.UpdateResponse;
import com.fortify.schema.fws.UploadResponse;
import com.fortify.schema.fws.UserListResponse;
import com.fortify.schema.fws.VariableHistoryListForProjectVersionAndVariableRequest;
import com.fortify.schema.fws.VariableHistoryListForSnapshotAndVariablesRequest;
import com.fortify.schema.fws.VariableHistoryListForSnapshotRequest;
import com.fortify.schema.fws.VariableHistoryListForVariableRequest;
import com.fortify.schema.fws.VariableHistoryListRequest;
import com.fortify.schema.fws.VariableHistoryListResponse;
import com.fortify.schema.fws.VerifyCloudOneTimeJobTokenResponse;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rootCause" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}rootCause" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "status", propOrder = {
    "code",
    "msg",
    "rootCause"
})
@XmlSeeAlso({
    SdlBundleUploadStatus.class,
    GenericError.class,
    SnapshotsForProjectVersionAndPriorToDateRequest.class,
    AuditViewResponse.class,
    ProjectMetaDataDefinitionResponse.class,
    FindLdapUserDnResponse.class,
    ProjectMetaDataDefinitionsListResponse.class,
    DocumentDefinitionListResponse.class,
    UserListResponse.class,
    SearchLdapResponse.class,
    VariableHistoryListForSnapshotAndVariablesRequest.class,
    TraceNodesResponse.class,
    IssueListResponse.class,
    RequirementTemplateListResponse.class,
    ProjectMetaDataValuesListResponse.class,
    RuntimeEventArchiveDownloadResponse.class,
    EquationVariableListResponse.class,
    MostRecentVariableHistoryListRequest.class,
    AlertDefinitionListResponse.class,
    DeleteResponse.class,
    MeasurementHistoryListResponse.class,
    GenericResponse.class,
    SavedReportByIdResponse.class,
    ReportDefinitionResponse.class,
    FprDownloadResponse.class,
    VariableHistoryListRequest.class,
    UpdateResponse.class,
    SavedReportListResponse.class,
    SavedReportListForProjectVersionResponse.class,
    CreateAuditSessionResponse.class,
    PermissionTemplateListResponse.class,
    ArchiveRuntimeEventResponse.class,
    DocumentArtifactDownloadResponse.class,
    ArtifactDownloadResponse.class,
    ProjectTemplateUploadResponse.class,
    MeasurementHistoryListForSnapshotRequest.class,
    JobStatusResponse.class,
    SnapshotsForProjectVersionRequest.class,
    CheckCurrentUserPermissionResponse.class,
    SubmitBugResponse.class,
    VariableHistoryListForVariableRequest.class,
    DateResponse.class,
    BatchCreateUpdateAndAssignCustomTagsResponse.class,
    GroupingValuesResponse.class,
    GetAuthenticationTokenResponse.class,
    AnalysisPayloadUploadResponse.class,
    AddStatus.class,
    ActiveProjectVersionListResponse.class,
    CustomTagListResponse.class,
    CurrentUserPermissionTemplateListResponse.class,
    VariableHistoryListResponse.class,
    SnapshotMostRecentFirstDateRequest.class,
    ProjectMetaDataValueResponse.class,
    TemplateAssignmentRuleListResponse.class,
    LicenseCapabilityListResponse.class,
    SnapshotListResponse.class,
    ActivityListResponse.class,
    RuntimeApplicationListResponse.class,
    MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest.class,
    CloudCtrlUrlResponse.class,
    RegisteredLdapEntityListResponse.class,
    MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest.class,
    VerifyCloudOneTimeJobTokenResponse.class,
    RuntimeEventArchiveListResponse.class,
    AlertDefinitionResponse.class,
    VariableHistoryListForProjectVersionAndVariableRequest.class,
    MeasurementHistoryListRequest.class,
    ReportDefinitionListResponse.class,
    MostRecentMeasurementHistoryListRequest.class,
    DescriptionAndRecommendationResponse.class,
    SnapshotsForProjectVersionAndDateRequest.class,
    UploadResponse.class,
    ProjectTemplateDownloadResponse.class,
    ProjectTemplateListResponse.class,
    SavedReportListForProjectVersionRequest.class,
    VariableHistoryListForSnapshotRequest.class,
    PerformanceIndicatorListResponse.class,
    DocumentTemplateDownloadResponse.class,
    GenerateReportResponse.class,
    PersonaListResponse.class,
    AuthenticationTokenListResponse.class,
    ActivityTemplateAssignmentRuleListResponse.class,
    CreateOrUpdateProjectMetaDataValuesListRequest.class,
    AnalysisPayloadDownloadResponse.class,
    CloudOneTimeJobTokenRequest.class,
    ProjectListResponse.class,
    SavedReportDownloadResponse.class
})
public class Status {

    protected long code;
    protected String msg;
    protected List<RootCause> rootCause;

    /**
     * Default no-arg constructor
     * 
     */
    public Status() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Status(final long code, final String msg, final List<RootCause> rootCause) {
        this.code = code;
        this.msg = msg;
        this.rootCause = rootCause;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Gets the value of the rootCause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootCause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootCause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RootCause }
     * 
     * 
     */
    public List<RootCause> getRootCause() {
        if (rootCause == null) {
            rootCause = new ArrayList<RootCause>();
        }
        return this.rootCause;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Sets the value of the rootCause property.
     * 
     * @param rootCause
     *     allowed object is
     *     {@link RootCause }
     *     
     */
    public void setRootCause(List<RootCause> rootCause) {
        this.rootCause = rootCause;
    }

    public Status withCode(long value) {
        setCode(value);
        return this;
    }

    public Status withMsg(String value) {
        setMsg(value);
        return this;
    }

    public Status withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    public Status withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    public Status withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}
