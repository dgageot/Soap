
package com.fortify.schema.fws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import xmlns.www_fortifysoftware_com.schema.wstypes.AddStatus;
import xmlns.www_fortifysoftware_com.schema.wstypes.LdapEntity;
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataDefinition;
import xmlns.www_fortifysoftware_com.schema.wstypes.Project;
import xmlns.www_fortifysoftware_com.schema.wstypes.SdlBundleUploadStatus;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;
import xmlns.www_fortifysoftware_com.schema.wstypes.TagDefinition;
import xmlns.www_fortifysoftware_com.schema.wstypes.User;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fortify.schema.fws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteProjectResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteProjectResponse");
    private final static QName _DeleteSavedReportsResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteSavedReportsResponse");
    private final static QName _AnalysisUploadReleaseResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AnalysisUploadReleaseResponse");
    private final static QName _UpdateProjectResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateProjectResponse");
    private final static QName _AssignCustomTagsToProjectVersionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AssignCustomTagsToProjectVersionResponse");
    private final static QName _JobListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "JobListRequest");
    private final static QName _AddProjectMetaDataDefinitionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AddProjectMetaDataDefinitionResponse");
    private final static QName _CloudCtrlUrlRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "CloudCtrlUrlRequest");
    private final static QName _AnalysisStatusUpdateResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AnalysisStatusUpdateResponse");
    private final static QName _AssignToProjectVersionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AssignToProjectVersionResponse");
    private final static QName _SourceArchiveUploadResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "SourceArchiveUploadResponse");
    private final static QName _AssignLdapEntityPermissionsResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AssignLdapEntityPermissionsResponse");
    private final static QName _UploadRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UploadRequest");
    private final static QName _AddUserRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AddUserRequest");
    private final static QName _Response_QNAME = new QName("http://www.fortify.com/schema/fws", "Response");
    private final static QName _HistoricalDataMigrateResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "HistoricalDataMigrateResponse");
    private final static QName _ActivityTemplateAssignmentRuleListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "ActivityTemplateAssignmentRuleListRequest");
    private final static QName _TemplateAssignmentRuleBatchUpdateResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "TemplateAssignmentRuleBatchUpdateResponse");
    private final static QName _TemplateAssignmentRuleListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "TemplateAssignmentRuleListRequest");
    private final static QName _AnalysisCompleteResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AnalysisCompleteResponse");
    private final static QName _UpdateCustomTagRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateCustomTagRequest");
    private final static QName _UpdateProjectMetaDataDefinitionRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateProjectMetaDataDefinitionRequest");
    private final static QName _AssignCustomTagsToProjectTemplateResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AssignCustomTagsToProjectTemplateResponse");
    private final static QName _UserListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UserListRequest");
    private final static QName _PermissionTemplateListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "PermissionTemplateListRequest");
    private final static QName _DocumentArtifactUploadResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DocumentArtifactUploadResponse");
    private final static QName _RuntimeApplicationListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "RuntimeApplicationListRequest");
    private final static QName _MigrateUserResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "MigrateUserResponse");
    private final static QName _AuthenticationTokenListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AuthenticationTokenListRequest");
    private final static QName _InvalidateTokenResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "InvalidateTokenResponse");
    private final static QName _RequirementTemplateListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "RequirementTemplateListRequest");
    private final static QName _FilterSetsAndFoldersUpdateResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "FilterSetsAndFoldersUpdateResponse");
    private final static QName _SavedReportListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "SavedReportListRequest");
    private final static QName _ContentBundleUploadResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "ContentBundleUploadResponse");
    private final static QName _AnalysisPayloadDispatchResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AnalysisPayloadDispatchResponse");
    private final static QName _AddCustomTagRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AddCustomTagRequest");
    private final static QName _UpdateCustomTagResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateCustomTagResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AddUserResponse");
    private final static QName _DeleteProjectVersionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteProjectVersionResponse");
    private final static QName _SdlBundleUploadResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "SDLBundleUploadResponse");
    private final static QName _AddProjectRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AddProjectRequest");
    private final static QName _LicenseCapabilityListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "LicenseCapabilityListRequest");
    private final static QName _AssignToRuntimeApplicationResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AssignToRuntimeApplicationResponse");
    private final static QName _ActiveProjectVersionListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "ActiveProjectVersionListRequest");
    private final static QName _MyAlertDefinitionsListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "MyAlertDefinitionsListRequest");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteUserResponse");
    private final static QName _ProjectListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "ProjectListRequest");
    private final static QName _UpdateUserRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateUserRequest");
    private final static QName _PerformanceIndicatorListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "PerformanceIndicatorListRequest");
    private final static QName _RuntimeEventArchiveListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "RuntimeEventArchiveListRequest");
    private final static QName _ActivityListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "ActivityListRequest");
    private final static QName _LdapEntityDeleteResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "LdapEntityDeleteResponse");
    private final static QName _InvalidateAuditSessionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "InvalidateAuditSessionResponse");
    private final static QName _DeleteRuntimeApplicationResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteRuntimeApplicationResponse");
    private final static QName _PerformAuditActionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "PerformAuditActionResponse");
    private final static QName _AddProjectMetaDataDefinitionRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AddProjectMetaDataDefinitionRequest");
    private final static QName _UpdateProjectMetaDataDefinitionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateProjectMetaDataDefinitionResponse");
    private final static QName _RegisteredLdapEntityListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "RegisteredLdapEntityListRequest");
    private final static QName _DeleteCustomTagResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteCustomTagResponse");
    private final static QName _DeleteRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "DeleteRequest");
    private final static QName _FprUploadResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "FPRUploadResponse");
    private final static QName _AddCustomTagResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AddCustomTagResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateUserResponse");
    private final static QName _AddProjectResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AddProjectResponse");
    private final static QName _UpdateRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateRequest");
    private final static QName _AssignLdapEntityPermissionsRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AssignLdapEntityPermissionsRequest");
    private final static QName _GenericRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "GenericRequest");
    private final static QName _AllAlertDefinitionsListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "AllAlertDefinitionsListRequest");
    private final static QName _AnalysisUploadDeleteResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AnalysisUploadDeleteResponse");
    private final static QName _AddProjectVersionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AddProjectVersionResponse");
    private final static QName _UpdateProjectRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "UpdateProjectRequest");
    private final static QName _AnalysisPayloadRedispatchResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AnalysisPayloadRedispatchResponse");
    private final static QName _PurgeProjectVersionResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "PurgeProjectVersionResponse");
    private final static QName _RestoreRuntimeEventResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "RestoreRuntimeEventResponse");
    private final static QName _AddRuntimeApplicationResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "AddRuntimeApplicationResponse");
    private final static QName _PersonaListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "PersonaListRequest");
    private final static QName _FprSimpleMigrateResponse_QNAME = new QName("http://www.fortify.com/schema/fws", "FPRSimpleMigrateResponse");
    private final static QName _FindLdapUserDnRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "FindLdapUserDNRequest");
    private final static QName _ProjectTemplateListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "ProjectTemplateListRequest");
    private final static QName _VerifyCloudOneTimeJobTokenRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "VerifyCloudOneTimeJobTokenRequest");
    private final static QName _EquationVariableListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "EquationVariableListRequest");
    private final static QName _CurrentUserPermissionTemplateListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "CurrentUserPermissionTemplateListRequest");
    private final static QName _DocumentDefinitionListRequest_QNAME = new QName("http://www.fortify.com/schema/fws", "DocumentDefinitionListRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fortify.schema.fws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CloudOneTimeJobTokenRequest }
     * 
     */
    public CloudOneTimeJobTokenRequest createCloudOneTimeJobTokenRequest() {
        return new CloudOneTimeJobTokenRequest();
    }

    /**
     * Create an instance of {@link DeleteSavedReportsRequest }
     * 
     */
    public DeleteSavedReportsRequest createDeleteSavedReportsRequest() {
        return new DeleteSavedReportsRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataDefinitionResponse }
     * 
     */
    public ProjectMetaDataDefinitionResponse createProjectMetaDataDefinitionResponse() {
        return new ProjectMetaDataDefinitionResponse();
    }

    /**
     * Create an instance of {@link ContentBundleUploadRequest }
     * 
     */
    public ContentBundleUploadRequest createContentBundleUploadRequest() {
        return new ContentBundleUploadRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataValueResponse }
     * 
     */
    public ProjectMetaDataValueResponse createProjectMetaDataValueResponse() {
        return new ProjectMetaDataValueResponse();
    }

    /**
     * Create an instance of {@link PersonaListResponse }
     * 
     */
    public PersonaListResponse createPersonaListResponse() {
        return new PersonaListResponse();
    }

    /**
     * Create an instance of {@link EquationVariableListResponse }
     * 
     */
    public EquationVariableListResponse createEquationVariableListResponse() {
        return new EquationVariableListResponse();
    }

    /**
     * Create an instance of {@link AssignCustomTagsToProjectTemplateRequest }
     * 
     */
    public AssignCustomTagsToProjectTemplateRequest createAssignCustomTagsToProjectTemplateRequest() {
        return new AssignCustomTagsToProjectTemplateRequest();
    }

    /**
     * Create an instance of {@link SearchLdapResponse }
     * 
     */
    public SearchLdapResponse createSearchLdapResponse() {
        return new SearchLdapResponse();
    }

    /**
     * Create an instance of {@link ActivityTemplateAssignmentRuleListResponse }
     * 
     */
    public ActivityTemplateAssignmentRuleListResponse createActivityTemplateAssignmentRuleListResponse() {
        return new ActivityTemplateAssignmentRuleListResponse();
    }

    /**
     * Create an instance of {@link RestoreRuntimeEventRequest }
     * 
     */
    public RestoreRuntimeEventRequest createRestoreRuntimeEventRequest() {
        return new RestoreRuntimeEventRequest();
    }

    /**
     * Create an instance of {@link IssueListResponse }
     * 
     */
    public IssueListResponse createIssueListResponse() {
        return new IssueListResponse();
    }

    /**
     * Create an instance of {@link SnapshotsForProjectVersionRequest }
     * 
     */
    public SnapshotsForProjectVersionRequest createSnapshotsForProjectVersionRequest() {
        return new SnapshotsForProjectVersionRequest();
    }

    /**
     * Create an instance of {@link ReportDefinitionByIdRequest }
     * 
     */
    public ReportDefinitionByIdRequest createReportDefinitionByIdRequest() {
        return new ReportDefinitionByIdRequest();
    }

    /**
     * Create an instance of {@link CloudCtrlUrlResponse }
     * 
     */
    public CloudCtrlUrlResponse createCloudCtrlUrlResponse() {
        return new CloudCtrlUrlResponse();
    }

    /**
     * Create an instance of {@link ReportDefinitionResponse }
     * 
     */
    public ReportDefinitionResponse createReportDefinitionResponse() {
        return new ReportDefinitionResponse();
    }

    /**
     * Create an instance of {@link DeleteUserRequest }
     * 
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
    }

    /**
     * Create an instance of {@link CreateOrUpdateProjectMetaDataValuesListRequest }
     * 
     */
    public CreateOrUpdateProjectMetaDataValuesListRequest createCreateOrUpdateProjectMetaDataValuesListRequest() {
        return new CreateOrUpdateProjectMetaDataValuesListRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataValuesListRequest }
     * 
     */
    public ProjectMetaDataValuesListRequest createProjectMetaDataValuesListRequest() {
        return new ProjectMetaDataValuesListRequest();
    }

    /**
     * Create an instance of {@link AddProjectAndVersionResponse }
     * 
     */
    public AddProjectAndVersionResponse createAddProjectAndVersionResponse() {
        return new AddProjectAndVersionResponse();
    }

    /**
     * Create an instance of {@link SavedReportDownloadRequest }
     * 
     */
    public SavedReportDownloadRequest createSavedReportDownloadRequest() {
        return new SavedReportDownloadRequest();
    }

    /**
     * Create an instance of {@link InvalidateAuditSessionRequest }
     * 
     */
    public InvalidateAuditSessionRequest createInvalidateAuditSessionRequest() {
        return new InvalidateAuditSessionRequest();
    }

    /**
     * Create an instance of {@link GetAuthenticationTokenRequest }
     * 
     */
    public GetAuthenticationTokenRequest createGetAuthenticationTokenRequest() {
        return new GetAuthenticationTokenRequest();
    }

    /**
     * Create an instance of {@link RuntimeEventArchiveDownloadResponse }
     * 
     */
    public RuntimeEventArchiveDownloadResponse createRuntimeEventArchiveDownloadResponse() {
        return new RuntimeEventArchiveDownloadResponse();
    }

    /**
     * Create an instance of {@link AnalysisUploadReleaseRequest }
     * 
     */
    public AnalysisUploadReleaseRequest createAnalysisUploadReleaseRequest() {
        return new AnalysisUploadReleaseRequest();
    }

    /**
     * Create an instance of {@link HistoricalDataMigrateRequest }
     * 
     */
    public HistoricalDataMigrateRequest createHistoricalDataMigrateRequest() {
        return new HistoricalDataMigrateRequest();
    }

    /**
     * Create an instance of {@link MigrateUserRequest }
     * 
     */
    public MigrateUserRequest createMigrateUserRequest() {
        return new MigrateUserRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataValuesListResponse }
     * 
     */
    public ProjectMetaDataValuesListResponse createProjectMetaDataValuesListResponse() {
        return new ProjectMetaDataValuesListResponse();
    }

    /**
     * Create an instance of {@link SourceArchiveUploadRequest }
     * 
     */
    public SourceArchiveUploadRequest createSourceArchiveUploadRequest() {
        return new SourceArchiveUploadRequest();
    }

    /**
     * Create an instance of {@link AssignToProjectVersionRequest }
     * 
     */
    public AssignToProjectVersionRequest createAssignToProjectVersionRequest() {
        return new AssignToProjectVersionRequest();
    }

    /**
     * Create an instance of {@link VariableHistoryListForProjectVersionAndVariableRequest }
     * 
     */
    public VariableHistoryListForProjectVersionAndVariableRequest createVariableHistoryListForProjectVersionAndVariableRequest() {
        return new VariableHistoryListForProjectVersionAndVariableRequest();
    }

    /**
     * Create an instance of {@link FprSimpleMigrateRequest }
     * 
     */
    public FprSimpleMigrateRequest createFprSimpleMigrateRequest() {
        return new FprSimpleMigrateRequest();
    }

    /**
     * Create an instance of {@link AddProjectVersionRequest }
     * 
     */
    public AddProjectVersionRequest createAddProjectVersionRequest() {
        return new AddProjectVersionRequest();
    }

    /**
     * Create an instance of {@link ReportDefinitionListResponse }
     * 
     */
    public ReportDefinitionListResponse createReportDefinitionListResponse() {
        return new ReportDefinitionListResponse();
    }

    /**
     * Create an instance of {@link ArchiveRuntimeEventResponse }
     * 
     */
    public ArchiveRuntimeEventResponse createArchiveRuntimeEventResponse() {
        return new ArchiveRuntimeEventResponse();
    }

    /**
     * Create an instance of {@link CustomTagListForProjectVersionRequest }
     * 
     */
    public CustomTagListForProjectVersionRequest createCustomTagListForProjectVersionRequest() {
        return new CustomTagListForProjectVersionRequest();
    }

    /**
     * Create an instance of {@link SnapshotListResponse }
     * 
     */
    public SnapshotListResponse createSnapshotListResponse() {
        return new SnapshotListResponse();
    }

    /**
     * Create an instance of {@link AuditViewRequest }
     * 
     */
    public AuditViewRequest createAuditViewRequest() {
        return new AuditViewRequest();
    }

    /**
     * Create an instance of {@link JobListResponse }
     * 
     */
    public JobListResponse createJobListResponse() {
        return new JobListResponse();
    }

    /**
     * Create an instance of {@link FilterSetsAndFoldersUpdateRequest }
     * 
     */
    public FilterSetsAndFoldersUpdateRequest createFilterSetsAndFoldersUpdateRequest() {
        return new FilterSetsAndFoldersUpdateRequest();
    }

    /**
     * Create an instance of {@link VariableHistoryListForSnapshotRequest }
     * 
     */
    public VariableHistoryListForSnapshotRequest createVariableHistoryListForSnapshotRequest() {
        return new VariableHistoryListForSnapshotRequest();
    }

    /**
     * Create an instance of {@link MeasurementHistoryListResponse }
     * 
     */
    public MeasurementHistoryListResponse createMeasurementHistoryListResponse() {
        return new MeasurementHistoryListResponse();
    }

    /**
     * Create an instance of {@link DocumentArtifactDownloadResponse }
     * 
     */
    public DocumentArtifactDownloadResponse createDocumentArtifactDownloadResponse() {
        return new DocumentArtifactDownloadResponse();
    }

    /**
     * Create an instance of {@link GenericResponse }
     * 
     */
    public GenericResponse createGenericResponse() {
        return new GenericResponse();
    }

    /**
     * Create an instance of {@link CustomTagListForProjectTemplateRequest }
     * 
     */
    public CustomTagListForProjectTemplateRequest createCustomTagListForProjectTemplateRequest() {
        return new CustomTagListForProjectTemplateRequest();
    }

    /**
     * Create an instance of {@link AlertDefinitionListResponse }
     * 
     */
    public AlertDefinitionListResponse createAlertDefinitionListResponse() {
        return new AlertDefinitionListResponse();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link ProjectTemplateDownloadResponse }
     * 
     */
    public ProjectTemplateDownloadResponse createProjectTemplateDownloadResponse() {
        return new ProjectTemplateDownloadResponse();
    }

    /**
     * Create an instance of {@link RegisteredLdapEntityListResponse }
     * 
     */
    public RegisteredLdapEntityListResponse createRegisteredLdapEntityListResponse() {
        return new RegisteredLdapEntityListResponse();
    }

    /**
     * Create an instance of {@link UpdateAlertDefinitionForSelfRequest }
     * 
     */
    public UpdateAlertDefinitionForSelfRequest createUpdateAlertDefinitionForSelfRequest() {
        return new UpdateAlertDefinitionForSelfRequest();
    }

    /**
     * Create an instance of {@link ArchiveRuntimeEventsInDateRangeRequest }
     * 
     */
    public ArchiveRuntimeEventsInDateRangeRequest createArchiveRuntimeEventsInDateRangeRequest() {
        return new ArchiveRuntimeEventsInDateRangeRequest();
    }

    /**
     * Create an instance of {@link DeleteProjectRequest }
     * 
     */
    public DeleteProjectRequest createDeleteProjectRequest() {
        return new DeleteProjectRequest();
    }

    /**
     * Create an instance of {@link DeleteRuntimeApplicationRequest }
     * 
     */
    public DeleteRuntimeApplicationRequest createDeleteRuntimeApplicationRequest() {
        return new DeleteRuntimeApplicationRequest();
    }

    /**
     * Create an instance of {@link TemplateAssignmentRuleListResponse }
     * 
     */
    public TemplateAssignmentRuleListResponse createTemplateAssignmentRuleListResponse() {
        return new TemplateAssignmentRuleListResponse();
    }

    /**
     * Create an instance of {@link UserListResponse }
     * 
     */
    public UserListResponse createUserListResponse() {
        return new UserListResponse();
    }

    /**
     * Create an instance of {@link MeasurementHistoryListRequest }
     * 
     */
    public MeasurementHistoryListRequest createMeasurementHistoryListRequest() {
        return new MeasurementHistoryListRequest();
    }

    /**
     * Create an instance of {@link GroupingValuesRequest }
     * 
     */
    public GroupingValuesRequest createGroupingValuesRequest() {
        return new GroupingValuesRequest();
    }

    /**
     * Create an instance of {@link ArtifactDownloadResponse }
     * 
     */
    public ArtifactDownloadResponse createArtifactDownloadResponse() {
        return new ArtifactDownloadResponse();
    }

    /**
     * Create an instance of {@link DescriptionAndRecommendationRequest }
     * 
     */
    public DescriptionAndRecommendationRequest createDescriptionAndRecommendationRequest() {
        return new DescriptionAndRecommendationRequest();
    }

    /**
     * Create an instance of {@link GenerateReportResponse }
     * 
     */
    public GenerateReportResponse createGenerateReportResponse() {
        return new GenerateReportResponse();
    }

    /**
     * Create an instance of {@link ReportDefinitionByNameRequest }
     * 
     */
    public ReportDefinitionByNameRequest createReportDefinitionByNameRequest() {
        return new ReportDefinitionByNameRequest();
    }

    /**
     * Create an instance of {@link CreateAlertDefinitionAndPropagateRequest }
     * 
     */
    public CreateAlertDefinitionAndPropagateRequest createCreateAlertDefinitionAndPropagateRequest() {
        return new CreateAlertDefinitionAndPropagateRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataValueRequest }
     * 
     */
    public ProjectMetaDataValueRequest createProjectMetaDataValueRequest() {
        return new ProjectMetaDataValueRequest();
    }

    /**
     * Create an instance of {@link ProjectTemplateListResponse }
     * 
     */
    public ProjectTemplateListResponse createProjectTemplateListResponse() {
        return new ProjectTemplateListResponse();
    }

    /**
     * Create an instance of {@link ArtifactDownloadRequest }
     * 
     */
    public ArtifactDownloadRequest createArtifactDownloadRequest() {
        return new ArtifactDownloadRequest();
    }

    /**
     * Create an instance of {@link AnalysisPayloadDownloadRequest }
     * 
     */
    public AnalysisPayloadDownloadRequest createAnalysisPayloadDownloadRequest() {
        return new AnalysisPayloadDownloadRequest();
    }

    /**
     * Create an instance of {@link ProjectTemplateDownloadRequest }
     * 
     */
    public ProjectTemplateDownloadRequest createProjectTemplateDownloadRequest() {
        return new ProjectTemplateDownloadRequest();
    }

    /**
     * Create an instance of {@link ArchiveRuntimeEventRequest }
     * 
     */
    public ArchiveRuntimeEventRequest createArchiveRuntimeEventRequest() {
        return new ArchiveRuntimeEventRequest();
    }

    /**
     * Create an instance of {@link TemplateAssignmentRuleBatchUpdateRequest }
     * 
     */
    public TemplateAssignmentRuleBatchUpdateRequest createTemplateAssignmentRuleBatchUpdateRequest() {
        return new TemplateAssignmentRuleBatchUpdateRequest();
    }

    /**
     * Create an instance of {@link VariableHistoryListForVariableRequest }
     * 
     */
    public VariableHistoryListForVariableRequest createVariableHistoryListForVariableRequest() {
        return new VariableHistoryListForVariableRequest();
    }

    /**
     * Create an instance of {@link AnalysisPayloadRedispatchRequest }
     * 
     */
    public AnalysisPayloadRedispatchRequest createAnalysisPayloadRedispatchRequest() {
        return new AnalysisPayloadRedispatchRequest();
    }

    /**
     * Create an instance of {@link TraceNodesRequest }
     * 
     */
    public TraceNodesRequest createTraceNodesRequest() {
        return new TraceNodesRequest();
    }

    /**
     * Create an instance of {@link RuntimeEventArchiveDownloadRequest }
     * 
     */
    public RuntimeEventArchiveDownloadRequest createRuntimeEventArchiveDownloadRequest() {
        return new RuntimeEventArchiveDownloadRequest();
    }

    /**
     * Create an instance of {@link ProjectListResponse }
     * 
     */
    public ProjectListResponse createProjectListResponse() {
        return new ProjectListResponse();
    }

    /**
     * Create an instance of {@link AnalysisUploadDeleteRequest }
     * 
     */
    public AnalysisUploadDeleteRequest createAnalysisUploadDeleteRequest() {
        return new AnalysisUploadDeleteRequest();
    }

    /**
     * Create an instance of {@link DocumentTemplateDownloadRequest }
     * 
     */
    public DocumentTemplateDownloadRequest createDocumentTemplateDownloadRequest() {
        return new DocumentTemplateDownloadRequest();
    }

    /**
     * Create an instance of {@link SubmitBugRequest }
     * 
     */
    public SubmitBugRequest createSubmitBugRequest() {
        return new SubmitBugRequest();
    }

    /**
     * Create an instance of {@link VerifyCloudOneTimeJobTokenResponse }
     * 
     */
    public VerifyCloudOneTimeJobTokenResponse createVerifyCloudOneTimeJobTokenResponse() {
        return new VerifyCloudOneTimeJobTokenResponse();
    }

    /**
     * Create an instance of {@link SavedReportByIdResponse }
     * 
     */
    public SavedReportByIdResponse createSavedReportByIdResponse() {
        return new SavedReportByIdResponse();
    }

    /**
     * Create an instance of {@link CheckCurrentUserPermissionRequest }
     * 
     */
    public CheckCurrentUserPermissionRequest createCheckCurrentUserPermissionRequest() {
        return new CheckCurrentUserPermissionRequest();
    }

    /**
     * Create an instance of {@link FindLdapUserDnResponse }
     * 
     */
    public FindLdapUserDnResponse createFindLdapUserDnResponse() {
        return new FindLdapUserDnResponse();
    }

    /**
     * Create an instance of {@link GenerateReportRequest }
     * 
     */
    public GenerateReportRequest createGenerateReportRequest() {
        return new GenerateReportRequest();
    }

    /**
     * Create an instance of {@link AddProjectAndVersionRequest }
     * 
     */
    public AddProjectAndVersionRequest createAddProjectAndVersionRequest() {
        return new AddProjectAndVersionRequest();
    }

    /**
     * Create an instance of {@link PermissionTemplateListResponse }
     * 
     */
    public PermissionTemplateListResponse createPermissionTemplateListResponse() {
        return new PermissionTemplateListResponse();
    }

    /**
     * Create an instance of {@link AlertDefinitionByIdRequest }
     * 
     */
    public AlertDefinitionByIdRequest createAlertDefinitionByIdRequest() {
        return new AlertDefinitionByIdRequest();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link IssueListRequest }
     * 
     */
    public IssueListRequest createIssueListRequest() {
        return new IssueListRequest();
    }

    /**
     * Create an instance of {@link ClientVersionRequest }
     * 
     */
    public ClientVersionRequest createClientVersionRequest() {
        return new ClientVersionRequest();
    }

    /**
     * Create an instance of {@link SavedReportListForProjectVersionRequest }
     * 
     */
    public SavedReportListForProjectVersionRequest createSavedReportListForProjectVersionRequest() {
        return new SavedReportListForProjectVersionRequest();
    }

    /**
     * Create an instance of {@link DocumentDefinitionListResponse }
     * 
     */
    public DocumentDefinitionListResponse createDocumentDefinitionListResponse() {
        return new DocumentDefinitionListResponse();
    }

    /**
     * Create an instance of {@link AnalysisCompleteRequest }
     * 
     */
    public AnalysisCompleteRequest createAnalysisCompleteRequest() {
        return new AnalysisCompleteRequest();
    }

    /**
     * Create an instance of {@link CheckCurrentUserPermissionResponse }
     * 
     */
    public CheckCurrentUserPermissionResponse createCheckCurrentUserPermissionResponse() {
        return new CheckCurrentUserPermissionResponse();
    }

    /**
     * Create an instance of {@link AlertDefinitionResponse }
     * 
     */
    public AlertDefinitionResponse createAlertDefinitionResponse() {
        return new AlertDefinitionResponse();
    }

    /**
     * Create an instance of {@link CreateAuditSessionRequest }
     * 
     */
    public CreateAuditSessionRequest createCreateAuditSessionRequest() {
        return new CreateAuditSessionRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataDefinitionsListRequest }
     * 
     */
    public ProjectMetaDataDefinitionsListRequest createProjectMetaDataDefinitionsListRequest() {
        return new ProjectMetaDataDefinitionsListRequest();
    }

    /**
     * Create an instance of {@link DeleteProjectVersionRequest }
     * 
     */
    public DeleteProjectVersionRequest createDeleteProjectVersionRequest() {
        return new DeleteProjectVersionRequest();
    }

    /**
     * Create an instance of {@link GroupingValuesResponse }
     * 
     */
    public GroupingValuesResponse createGroupingValuesResponse() {
        return new GroupingValuesResponse();
    }

    /**
     * Create an instance of {@link VariableHistoryListResponse }
     * 
     */
    public VariableHistoryListResponse createVariableHistoryListResponse() {
        return new VariableHistoryListResponse();
    }

    /**
     * Create an instance of {@link AddRuntimeApplicationRequest }
     * 
     */
    public AddRuntimeApplicationRequest createAddRuntimeApplicationRequest() {
        return new AddRuntimeApplicationRequest();
    }

    /**
     * Create an instance of {@link SnapshotsForProjectVersionAndDateRequest }
     * 
     */
    public SnapshotsForProjectVersionAndDateRequest createSnapshotsForProjectVersionAndDateRequest() {
        return new SnapshotsForProjectVersionAndDateRequest();
    }

    /**
     * Create an instance of {@link AuditViewResponse }
     * 
     */
    public AuditViewResponse createAuditViewResponse() {
        return new AuditViewResponse();
    }

    /**
     * Create an instance of {@link SearchLdapRequest }
     * 
     */
    public SearchLdapRequest createSearchLdapRequest() {
        return new SearchLdapRequest();
    }

    /**
     * Create an instance of {@link MeasurementHistoryListForSnapshotRequest }
     * 
     */
    public MeasurementHistoryListForSnapshotRequest createMeasurementHistoryListForSnapshotRequest() {
        return new MeasurementHistoryListForSnapshotRequest();
    }

    /**
     * Create an instance of {@link SdlBundleUploadRequest }
     * 
     */
    public SdlBundleUploadRequest createSdlBundleUploadRequest() {
        return new SdlBundleUploadRequest();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetAuthenticationTokenResponse }
     * 
     */
    public GetAuthenticationTokenResponse createGetAuthenticationTokenResponse() {
        return new GetAuthenticationTokenResponse();
    }

    /**
     * Create an instance of {@link AnalysisStatusUpdateRequest }
     * 
     */
    public AnalysisStatusUpdateRequest createAnalysisStatusUpdateRequest() {
        return new AnalysisStatusUpdateRequest();
    }

    /**
     * Create an instance of {@link VariableHistoryListRequest }
     * 
     */
    public VariableHistoryListRequest createVariableHistoryListRequest() {
        return new VariableHistoryListRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomTagRequest }
     * 
     */
    public DeleteCustomTagRequest createDeleteCustomTagRequest() {
        return new DeleteCustomTagRequest();
    }

    /**
     * Create an instance of {@link LdapEntityDeleteRequest }
     * 
     */
    public LdapEntityDeleteRequest createLdapEntityDeleteRequest() {
        return new LdapEntityDeleteRequest();
    }

    /**
     * Create an instance of {@link AssignToRuntimeApplicationRequest }
     * 
     */
    public AssignToRuntimeApplicationRequest createAssignToRuntimeApplicationRequest() {
        return new AssignToRuntimeApplicationRequest();
    }

    /**
     * Create an instance of {@link TraceNodesResponse }
     * 
     */
    public TraceNodesResponse createTraceNodesResponse() {
        return new TraceNodesResponse();
    }

    /**
     * Create an instance of {@link JobStatusRequest }
     * 
     */
    public JobStatusRequest createJobStatusRequest() {
        return new JobStatusRequest();
    }

    /**
     * Create an instance of {@link BatchCreateUpdateAndAssignCustomTagsResponse }
     * 
     */
    public BatchCreateUpdateAndAssignCustomTagsResponse createBatchCreateUpdateAndAssignCustomTagsResponse() {
        return new BatchCreateUpdateAndAssignCustomTagsResponse();
    }

    /**
     * Create an instance of {@link SnapshotsForProjectVersionAndPriorToDateRequest }
     * 
     */
    public SnapshotsForProjectVersionAndPriorToDateRequest createSnapshotsForProjectVersionAndPriorToDateRequest() {
        return new SnapshotsForProjectVersionAndPriorToDateRequest();
    }

    /**
     * Create an instance of {@link BatchCreateUpdateAndAssignCustomTagsRequest }
     * 
     */
    public BatchCreateUpdateAndAssignCustomTagsRequest createBatchCreateUpdateAndAssignCustomTagsRequest() {
        return new BatchCreateUpdateAndAssignCustomTagsRequest();
    }

    /**
     * Create an instance of {@link PerformAuditActionRequest }
     * 
     */
    public PerformAuditActionRequest createPerformAuditActionRequest() {
        return new PerformAuditActionRequest();
    }

    /**
     * Create an instance of {@link CurrentUserPermissionTemplateListResponse }
     * 
     */
    public CurrentUserPermissionTemplateListResponse createCurrentUserPermissionTemplateListResponse() {
        return new CurrentUserPermissionTemplateListResponse();
    }

    /**
     * Create an instance of {@link MostRecentMeasurementHistoryListRequest }
     * 
     */
    public MostRecentMeasurementHistoryListRequest createMostRecentMeasurementHistoryListRequest() {
        return new MostRecentMeasurementHistoryListRequest();
    }

    /**
     * Create an instance of {@link FprDownloadRequest }
     * 
     */
    public FprDownloadRequest createFprDownloadRequest() {
        return new FprDownloadRequest();
    }

    /**
     * Create an instance of {@link RuntimeApplicationListResponse }
     * 
     */
    public RuntimeApplicationListResponse createRuntimeApplicationListResponse() {
        return new RuntimeApplicationListResponse();
    }

    /**
     * Create an instance of {@link AssignCustomTagsToProjectVersionRequest }
     * 
     */
    public AssignCustomTagsToProjectVersionRequest createAssignCustomTagsToProjectVersionRequest() {
        return new AssignCustomTagsToProjectVersionRequest();
    }

    /**
     * Create an instance of {@link FprDownloadResponse }
     * 
     */
    public FprDownloadResponse createFprDownloadResponse() {
        return new FprDownloadResponse();
    }

    /**
     * Create an instance of {@link ProjectTemplateUploadRequest }
     * 
     */
    public ProjectTemplateUploadRequest createProjectTemplateUploadRequest() {
        return new ProjectTemplateUploadRequest();
    }

    /**
     * Create an instance of {@link FprUploadRequest }
     * 
     */
    public FprUploadRequest createFprUploadRequest() {
        return new FprUploadRequest();
    }

    /**
     * Create an instance of {@link DocumentArtifactUploadRequest }
     * 
     */
    public DocumentArtifactUploadRequest createDocumentArtifactUploadRequest() {
        return new DocumentArtifactUploadRequest();
    }

    /**
     * Create an instance of {@link ProjectTemplateUploadResponse }
     * 
     */
    public ProjectTemplateUploadResponse createProjectTemplateUploadResponse() {
        return new ProjectTemplateUploadResponse();
    }

    /**
     * Create an instance of {@link InvalidateTokenRequest }
     * 
     */
    public InvalidateTokenRequest createInvalidateTokenRequest() {
        return new InvalidateTokenRequest();
    }

    /**
     * Create an instance of {@link GetSingleUseFprDownloadTokenRequest }
     * 
     */
    public GetSingleUseFprDownloadTokenRequest createGetSingleUseFprDownloadTokenRequest() {
        return new GetSingleUseFprDownloadTokenRequest();
    }

    /**
     * Create an instance of {@link RequirementTemplateListResponse }
     * 
     */
    public RequirementTemplateListResponse createRequirementTemplateListResponse() {
        return new RequirementTemplateListResponse();
    }

    /**
     * Create an instance of {@link GenericNotificationEvent }
     * 
     */
    public GenericNotificationEvent createGenericNotificationEvent() {
        return new GenericNotificationEvent();
    }

    /**
     * Create an instance of {@link DocumentTemplateDownloadResponse }
     * 
     */
    public DocumentTemplateDownloadResponse createDocumentTemplateDownloadResponse() {
        return new DocumentTemplateDownloadResponse();
    }

    /**
     * Create an instance of {@link SavedReportListForProjectVersionResponse }
     * 
     */
    public SavedReportListForProjectVersionResponse createSavedReportListForProjectVersionResponse() {
        return new SavedReportListForProjectVersionResponse();
    }

    /**
     * Create an instance of {@link DocumentArtifactDownloadRequest }
     * 
     */
    public DocumentArtifactDownloadRequest createDocumentArtifactDownloadRequest() {
        return new DocumentArtifactDownloadRequest();
    }

    /**
     * Create an instance of {@link CustomTagListResponse }
     * 
     */
    public CustomTagListResponse createCustomTagListResponse() {
        return new CustomTagListResponse();
    }

    /**
     * Create an instance of {@link SubmitBugResponse }
     * 
     */
    public SubmitBugResponse createSubmitBugResponse() {
        return new SubmitBugResponse();
    }

    /**
     * Create an instance of {@link AnalysisPayloadDispatchRequest }
     * 
     */
    public AnalysisPayloadDispatchRequest createAnalysisPayloadDispatchRequest() {
        return new AnalysisPayloadDispatchRequest();
    }

    /**
     * Create an instance of {@link PurgeProjectVersionRequest }
     * 
     */
    public PurgeProjectVersionRequest createPurgeProjectVersionRequest() {
        return new PurgeProjectVersionRequest();
    }

    /**
     * Create an instance of {@link CreateAlertDefinitionForSelfRequest }
     * 
     */
    public CreateAlertDefinitionForSelfRequest createCreateAlertDefinitionForSelfRequest() {
        return new CreateAlertDefinitionForSelfRequest();
    }

    /**
     * Create an instance of {@link GetSingleUseFprUploadTokenRequest }
     * 
     */
    public GetSingleUseFprUploadTokenRequest createGetSingleUseFprUploadTokenRequest() {
        return new GetSingleUseFprUploadTokenRequest();
    }

    /**
     * Create an instance of {@link AnalysisPayloadUploadRequest }
     * 
     */
    public AnalysisPayloadUploadRequest createAnalysisPayloadUploadRequest() {
        return new AnalysisPayloadUploadRequest();
    }

    /**
     * Create an instance of {@link MostRecentVariableHistoryListRequest }
     * 
     */
    public MostRecentVariableHistoryListRequest createMostRecentVariableHistoryListRequest() {
        return new MostRecentVariableHistoryListRequest();
    }

    /**
     * Create an instance of {@link SavedReportByIdRequest }
     * 
     */
    public SavedReportByIdRequest createSavedReportByIdRequest() {
        return new SavedReportByIdRequest();
    }

    /**
     * Create an instance of {@link SavedReportListResponse }
     * 
     */
    public SavedReportListResponse createSavedReportListResponse() {
        return new SavedReportListResponse();
    }

    /**
     * Create an instance of {@link CustomTagListRequest }
     * 
     */
    public CustomTagListRequest createCustomTagListRequest() {
        return new CustomTagListRequest();
    }

    /**
     * Create an instance of {@link VariableHistoryListForSnapshotAndVariablesRequest }
     * 
     */
    public VariableHistoryListForSnapshotAndVariablesRequest createVariableHistoryListForSnapshotAndVariablesRequest() {
        return new VariableHistoryListForSnapshotAndVariablesRequest();
    }

    /**
     * Create an instance of {@link SavedReportDownloadResponse }
     * 
     */
    public SavedReportDownloadResponse createSavedReportDownloadResponse() {
        return new SavedReportDownloadResponse();
    }

    /**
     * Create an instance of {@link AnalysisPayloadDownloadResponse }
     * 
     */
    public AnalysisPayloadDownloadResponse createAnalysisPayloadDownloadResponse() {
        return new AnalysisPayloadDownloadResponse();
    }

    /**
     * Create an instance of {@link UpdateAlertDefinitionAndPropagateRequest }
     * 
     */
    public UpdateAlertDefinitionAndPropagateRequest createUpdateAlertDefinitionAndPropagateRequest() {
        return new UpdateAlertDefinitionAndPropagateRequest();
    }

    /**
     * Create an instance of {@link MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest }
     * 
     */
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest createMeasurementHistoryListForSnapshotAndMeasurementAgentsRequest() {
        return new MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest();
    }

    /**
     * Create an instance of {@link JobStatusResponse }
     * 
     */
    public JobStatusResponse createJobStatusResponse() {
        return new JobStatusResponse();
    }

    /**
     * Create an instance of {@link ProjectMetaDataDefinitionByGuidRequest }
     * 
     */
    public ProjectMetaDataDefinitionByGuidRequest createProjectMetaDataDefinitionByGuidRequest() {
        return new ProjectMetaDataDefinitionByGuidRequest();
    }

    /**
     * Create an instance of {@link ProjectMetaDataDefinitionsListResponse }
     * 
     */
    public ProjectMetaDataDefinitionsListResponse createProjectMetaDataDefinitionsListResponse() {
        return new ProjectMetaDataDefinitionsListResponse();
    }

    /**
     * Create an instance of {@link LicenseCapabilityListResponse }
     * 
     */
    public LicenseCapabilityListResponse createLicenseCapabilityListResponse() {
        return new LicenseCapabilityListResponse();
    }

    /**
     * Create an instance of {@link ActiveProjectVersionListResponse }
     * 
     */
    public ActiveProjectVersionListResponse createActiveProjectVersionListResponse() {
        return new ActiveProjectVersionListResponse();
    }

    /**
     * Create an instance of {@link AuthenticationTokenListResponse }
     * 
     */
    public AuthenticationTokenListResponse createAuthenticationTokenListResponse() {
        return new AuthenticationTokenListResponse();
    }

    /**
     * Create an instance of {@link AnalysisPayloadUploadResponse }
     * 
     */
    public AnalysisPayloadUploadResponse createAnalysisPayloadUploadResponse() {
        return new AnalysisPayloadUploadResponse();
    }

    /**
     * Create an instance of {@link CreateAuditSessionResponse }
     * 
     */
    public CreateAuditSessionResponse createCreateAuditSessionResponse() {
        return new CreateAuditSessionResponse();
    }

    /**
     * Create an instance of {@link PerformanceIndicatorListResponse }
     * 
     */
    public PerformanceIndicatorListResponse createPerformanceIndicatorListResponse() {
        return new PerformanceIndicatorListResponse();
    }

    /**
     * Create an instance of {@link RuntimeEventArchiveListResponse }
     * 
     */
    public RuntimeEventArchiveListResponse createRuntimeEventArchiveListResponse() {
        return new RuntimeEventArchiveListResponse();
    }

    /**
     * Create an instance of {@link ReportDefinitionListRequest }
     * 
     */
    public ReportDefinitionListRequest createReportDefinitionListRequest() {
        return new ReportDefinitionListRequest();
    }

    /**
     * Create an instance of {@link ActivityListResponse }
     * 
     */
    public ActivityListResponse createActivityListResponse() {
        return new ActivityListResponse();
    }

    /**
     * Create an instance of {@link MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest }
     * 
     */
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest createMeasurementHistoryListForProjectVersionAndMeasurementAgentRequest() {
        return new MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest();
    }

    /**
     * Create an instance of {@link SnapshotMostRecentFirstDateRequest }
     * 
     */
    public SnapshotMostRecentFirstDateRequest createSnapshotMostRecentFirstDateRequest() {
        return new SnapshotMostRecentFirstDateRequest();
    }

    /**
     * Create an instance of {@link DescriptionAndRecommendationResponse }
     * 
     */
    public DescriptionAndRecommendationResponse createDescriptionAndRecommendationResponse() {
        return new DescriptionAndRecommendationResponse();
    }

    /**
     * Create an instance of {@link DateResponse }
     * 
     */
    public DateResponse createDateResponse() {
        return new DateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteProjectResponse")
    public JAXBElement<Status> createDeleteProjectResponse(Status value) {
        return new JAXBElement<Status>(_DeleteProjectResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteSavedReportsResponse")
    public JAXBElement<Status> createDeleteSavedReportsResponse(Status value) {
        return new JAXBElement<Status>(_DeleteSavedReportsResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AnalysisUploadReleaseResponse")
    public JAXBElement<Status> createAnalysisUploadReleaseResponse(Status value) {
        return new JAXBElement<Status>(_AnalysisUploadReleaseResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateProjectResponse")
    public JAXBElement<Status> createUpdateProjectResponse(Status value) {
        return new JAXBElement<Status>(_UpdateProjectResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AssignCustomTagsToProjectVersionResponse")
    public JAXBElement<Status> createAssignCustomTagsToProjectVersionResponse(Status value) {
        return new JAXBElement<Status>(_AssignCustomTagsToProjectVersionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "JobListRequest")
    public JAXBElement<Object> createJobListRequest(Object value) {
        return new JAXBElement<Object>(_JobListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddProjectMetaDataDefinitionResponse")
    public JAXBElement<Status> createAddProjectMetaDataDefinitionResponse(Status value) {
        return new JAXBElement<Status>(_AddProjectMetaDataDefinitionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "CloudCtrlUrlRequest")
    public JAXBElement<Object> createCloudCtrlUrlRequest(Object value) {
        return new JAXBElement<Object>(_CloudCtrlUrlRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AnalysisStatusUpdateResponse")
    public JAXBElement<Status> createAnalysisStatusUpdateResponse(Status value) {
        return new JAXBElement<Status>(_AnalysisStatusUpdateResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AssignToProjectVersionResponse")
    public JAXBElement<Status> createAssignToProjectVersionResponse(Status value) {
        return new JAXBElement<Status>(_AssignToProjectVersionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "SourceArchiveUploadResponse")
    public JAXBElement<Status> createSourceArchiveUploadResponse(Status value) {
        return new JAXBElement<Status>(_SourceArchiveUploadResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AssignLdapEntityPermissionsResponse")
    public JAXBElement<Status> createAssignLdapEntityPermissionsResponse(Status value) {
        return new JAXBElement<Status>(_AssignLdapEntityPermissionsResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UploadRequest")
    public JAXBElement<Status> createUploadRequest(Status value) {
        return new JAXBElement<Status>(_UploadRequest_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddUserRequest")
    public JAXBElement<User> createAddUserRequest(User value) {
        return new JAXBElement<User>(_AddUserRequest_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "Response")
    public JAXBElement<Status> createResponse(Status value) {
        return new JAXBElement<Status>(_Response_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "HistoricalDataMigrateResponse")
    public JAXBElement<Status> createHistoricalDataMigrateResponse(Status value) {
        return new JAXBElement<Status>(_HistoricalDataMigrateResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "ActivityTemplateAssignmentRuleListRequest")
    public JAXBElement<Object> createActivityTemplateAssignmentRuleListRequest(Object value) {
        return new JAXBElement<Object>(_ActivityTemplateAssignmentRuleListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "TemplateAssignmentRuleBatchUpdateResponse")
    public JAXBElement<Status> createTemplateAssignmentRuleBatchUpdateResponse(Status value) {
        return new JAXBElement<Status>(_TemplateAssignmentRuleBatchUpdateResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "TemplateAssignmentRuleListRequest")
    public JAXBElement<Object> createTemplateAssignmentRuleListRequest(Object value) {
        return new JAXBElement<Object>(_TemplateAssignmentRuleListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AnalysisCompleteResponse")
    public JAXBElement<Status> createAnalysisCompleteResponse(Status value) {
        return new JAXBElement<Status>(_AnalysisCompleteResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateCustomTagRequest")
    public JAXBElement<TagDefinition> createUpdateCustomTagRequest(TagDefinition value) {
        return new JAXBElement<TagDefinition>(_UpdateCustomTagRequest_QNAME, TagDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateProjectMetaDataDefinitionRequest")
    public JAXBElement<MetaDataDefinition> createUpdateProjectMetaDataDefinitionRequest(MetaDataDefinition value) {
        return new JAXBElement<MetaDataDefinition>(_UpdateProjectMetaDataDefinitionRequest_QNAME, MetaDataDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AssignCustomTagsToProjectTemplateResponse")
    public JAXBElement<Status> createAssignCustomTagsToProjectTemplateResponse(Status value) {
        return new JAXBElement<Status>(_AssignCustomTagsToProjectTemplateResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UserListRequest")
    public JAXBElement<Object> createUserListRequest(Object value) {
        return new JAXBElement<Object>(_UserListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "PermissionTemplateListRequest")
    public JAXBElement<Object> createPermissionTemplateListRequest(Object value) {
        return new JAXBElement<Object>(_PermissionTemplateListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DocumentArtifactUploadResponse")
    public JAXBElement<AddStatus> createDocumentArtifactUploadResponse(AddStatus value) {
        return new JAXBElement<AddStatus>(_DocumentArtifactUploadResponse_QNAME, AddStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "RuntimeApplicationListRequest")
    public JAXBElement<Object> createRuntimeApplicationListRequest(Object value) {
        return new JAXBElement<Object>(_RuntimeApplicationListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "MigrateUserResponse")
    public JAXBElement<AddStatus> createMigrateUserResponse(AddStatus value) {
        return new JAXBElement<AddStatus>(_MigrateUserResponse_QNAME, AddStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AuthenticationTokenListRequest")
    public JAXBElement<Object> createAuthenticationTokenListRequest(Object value) {
        return new JAXBElement<Object>(_AuthenticationTokenListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "InvalidateTokenResponse")
    public JAXBElement<Status> createInvalidateTokenResponse(Status value) {
        return new JAXBElement<Status>(_InvalidateTokenResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "RequirementTemplateListRequest")
    public JAXBElement<Object> createRequirementTemplateListRequest(Object value) {
        return new JAXBElement<Object>(_RequirementTemplateListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "FilterSetsAndFoldersUpdateResponse")
    public JAXBElement<Status> createFilterSetsAndFoldersUpdateResponse(Status value) {
        return new JAXBElement<Status>(_FilterSetsAndFoldersUpdateResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "SavedReportListRequest")
    public JAXBElement<Object> createSavedReportListRequest(Object value) {
        return new JAXBElement<Object>(_SavedReportListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "ContentBundleUploadResponse")
    public JAXBElement<Status> createContentBundleUploadResponse(Status value) {
        return new JAXBElement<Status>(_ContentBundleUploadResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AnalysisPayloadDispatchResponse")
    public JAXBElement<Status> createAnalysisPayloadDispatchResponse(Status value) {
        return new JAXBElement<Status>(_AnalysisPayloadDispatchResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddCustomTagRequest")
    public JAXBElement<TagDefinition> createAddCustomTagRequest(TagDefinition value) {
        return new JAXBElement<TagDefinition>(_AddCustomTagRequest_QNAME, TagDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateCustomTagResponse")
    public JAXBElement<Status> createUpdateCustomTagResponse(Status value) {
        return new JAXBElement<Status>(_UpdateCustomTagResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddUserResponse")
    public JAXBElement<AddStatus> createAddUserResponse(AddStatus value) {
        return new JAXBElement<AddStatus>(_AddUserResponse_QNAME, AddStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteProjectVersionResponse")
    public JAXBElement<Status> createDeleteProjectVersionResponse(Status value) {
        return new JAXBElement<Status>(_DeleteProjectVersionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdlBundleUploadStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "SDLBundleUploadResponse")
    public JAXBElement<SdlBundleUploadStatus> createSdlBundleUploadResponse(SdlBundleUploadStatus value) {
        return new JAXBElement<SdlBundleUploadStatus>(_SdlBundleUploadResponse_QNAME, SdlBundleUploadStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddProjectRequest")
    public JAXBElement<Project> createAddProjectRequest(Project value) {
        return new JAXBElement<Project>(_AddProjectRequest_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "LicenseCapabilityListRequest")
    public JAXBElement<Object> createLicenseCapabilityListRequest(Object value) {
        return new JAXBElement<Object>(_LicenseCapabilityListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AssignToRuntimeApplicationResponse")
    public JAXBElement<Status> createAssignToRuntimeApplicationResponse(Status value) {
        return new JAXBElement<Status>(_AssignToRuntimeApplicationResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "ActiveProjectVersionListRequest")
    public JAXBElement<Object> createActiveProjectVersionListRequest(Object value) {
        return new JAXBElement<Object>(_ActiveProjectVersionListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "MyAlertDefinitionsListRequest")
    public JAXBElement<Object> createMyAlertDefinitionsListRequest(Object value) {
        return new JAXBElement<Object>(_MyAlertDefinitionsListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteUserResponse")
    public JAXBElement<Status> createDeleteUserResponse(Status value) {
        return new JAXBElement<Status>(_DeleteUserResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "ProjectListRequest")
    public JAXBElement<Object> createProjectListRequest(Object value) {
        return new JAXBElement<Object>(_ProjectListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateUserRequest")
    public JAXBElement<User> createUpdateUserRequest(User value) {
        return new JAXBElement<User>(_UpdateUserRequest_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "PerformanceIndicatorListRequest")
    public JAXBElement<Object> createPerformanceIndicatorListRequest(Object value) {
        return new JAXBElement<Object>(_PerformanceIndicatorListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "RuntimeEventArchiveListRequest")
    public JAXBElement<Object> createRuntimeEventArchiveListRequest(Object value) {
        return new JAXBElement<Object>(_RuntimeEventArchiveListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "ActivityListRequest")
    public JAXBElement<Object> createActivityListRequest(Object value) {
        return new JAXBElement<Object>(_ActivityListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "LdapEntityDeleteResponse")
    public JAXBElement<Status> createLdapEntityDeleteResponse(Status value) {
        return new JAXBElement<Status>(_LdapEntityDeleteResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "InvalidateAuditSessionResponse")
    public JAXBElement<Status> createInvalidateAuditSessionResponse(Status value) {
        return new JAXBElement<Status>(_InvalidateAuditSessionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteRuntimeApplicationResponse")
    public JAXBElement<Status> createDeleteRuntimeApplicationResponse(Status value) {
        return new JAXBElement<Status>(_DeleteRuntimeApplicationResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "PerformAuditActionResponse")
    public JAXBElement<Status> createPerformAuditActionResponse(Status value) {
        return new JAXBElement<Status>(_PerformAuditActionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddProjectMetaDataDefinitionRequest")
    public JAXBElement<MetaDataDefinition> createAddProjectMetaDataDefinitionRequest(MetaDataDefinition value) {
        return new JAXBElement<MetaDataDefinition>(_AddProjectMetaDataDefinitionRequest_QNAME, MetaDataDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateProjectMetaDataDefinitionResponse")
    public JAXBElement<Status> createUpdateProjectMetaDataDefinitionResponse(Status value) {
        return new JAXBElement<Status>(_UpdateProjectMetaDataDefinitionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "RegisteredLdapEntityListRequest")
    public JAXBElement<Object> createRegisteredLdapEntityListRequest(Object value) {
        return new JAXBElement<Object>(_RegisteredLdapEntityListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteCustomTagResponse")
    public JAXBElement<Status> createDeleteCustomTagResponse(Status value) {
        return new JAXBElement<Status>(_DeleteCustomTagResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DeleteRequest")
    public JAXBElement<Status> createDeleteRequest(Status value) {
        return new JAXBElement<Status>(_DeleteRequest_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "FPRUploadResponse")
    public JAXBElement<Status> createFprUploadResponse(Status value) {
        return new JAXBElement<Status>(_FprUploadResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddCustomTagResponse")
    public JAXBElement<Status> createAddCustomTagResponse(Status value) {
        return new JAXBElement<Status>(_AddCustomTagResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateUserResponse")
    public JAXBElement<Status> createUpdateUserResponse(Status value) {
        return new JAXBElement<Status>(_UpdateUserResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddProjectResponse")
    public JAXBElement<AddStatus> createAddProjectResponse(AddStatus value) {
        return new JAXBElement<AddStatus>(_AddProjectResponse_QNAME, AddStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateRequest")
    public JAXBElement<Status> createUpdateRequest(Status value) {
        return new JAXBElement<Status>(_UpdateRequest_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AssignLdapEntityPermissionsRequest")
    public JAXBElement<LdapEntity> createAssignLdapEntityPermissionsRequest(LdapEntity value) {
        return new JAXBElement<LdapEntity>(_AssignLdapEntityPermissionsRequest_QNAME, LdapEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "GenericRequest")
    public JAXBElement<Status> createGenericRequest(Status value) {
        return new JAXBElement<Status>(_GenericRequest_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AllAlertDefinitionsListRequest")
    public JAXBElement<Object> createAllAlertDefinitionsListRequest(Object value) {
        return new JAXBElement<Object>(_AllAlertDefinitionsListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AnalysisUploadDeleteResponse")
    public JAXBElement<Status> createAnalysisUploadDeleteResponse(Status value) {
        return new JAXBElement<Status>(_AnalysisUploadDeleteResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddProjectVersionResponse")
    public JAXBElement<AddStatus> createAddProjectVersionResponse(AddStatus value) {
        return new JAXBElement<AddStatus>(_AddProjectVersionResponse_QNAME, AddStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "UpdateProjectRequest")
    public JAXBElement<Project> createUpdateProjectRequest(Project value) {
        return new JAXBElement<Project>(_UpdateProjectRequest_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AnalysisPayloadRedispatchResponse")
    public JAXBElement<Status> createAnalysisPayloadRedispatchResponse(Status value) {
        return new JAXBElement<Status>(_AnalysisPayloadRedispatchResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "PurgeProjectVersionResponse")
    public JAXBElement<Status> createPurgeProjectVersionResponse(Status value) {
        return new JAXBElement<Status>(_PurgeProjectVersionResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "RestoreRuntimeEventResponse")
    public JAXBElement<Status> createRestoreRuntimeEventResponse(Status value) {
        return new JAXBElement<Status>(_RestoreRuntimeEventResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "AddRuntimeApplicationResponse")
    public JAXBElement<AddStatus> createAddRuntimeApplicationResponse(AddStatus value) {
        return new JAXBElement<AddStatus>(_AddRuntimeApplicationResponse_QNAME, AddStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "PersonaListRequest")
    public JAXBElement<Object> createPersonaListRequest(Object value) {
        return new JAXBElement<Object>(_PersonaListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "FPRSimpleMigrateResponse")
    public JAXBElement<Status> createFprSimpleMigrateResponse(Status value) {
        return new JAXBElement<Status>(_FprSimpleMigrateResponse_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "FindLdapUserDNRequest")
    public JAXBElement<String> createFindLdapUserDnRequest(String value) {
        return new JAXBElement<String>(_FindLdapUserDnRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "ProjectTemplateListRequest")
    public JAXBElement<Object> createProjectTemplateListRequest(Object value) {
        return new JAXBElement<Object>(_ProjectTemplateListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "VerifyCloudOneTimeJobTokenRequest")
    public JAXBElement<Object> createVerifyCloudOneTimeJobTokenRequest(Object value) {
        return new JAXBElement<Object>(_VerifyCloudOneTimeJobTokenRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "EquationVariableListRequest")
    public JAXBElement<Object> createEquationVariableListRequest(Object value) {
        return new JAXBElement<Object>(_EquationVariableListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "CurrentUserPermissionTemplateListRequest")
    public JAXBElement<Object> createCurrentUserPermissionTemplateListRequest(Object value) {
        return new JAXBElement<Object>(_CurrentUserPermissionTemplateListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fortify.com/schema/fws", name = "DocumentDefinitionListRequest")
    public JAXBElement<Object> createDocumentDefinitionListRequest(Object value) {
        return new JAXBElement<Object>(_DocumentDefinitionListRequest_QNAME, Object.class, null, value);
    }

}
