
package xmlns.www_fortifysoftware_com.schema.seed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.IssueCorrelationStrategies;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Global" type="{xmlns://www.fortifysoftware.com/schema/seed}F360Global" minOccurs="0"/>
 *         &lt;element name="Bootstrap" type="{xmlns://www.fortifysoftware.com/schema/seed}Bootstrap" minOccurs="0"/>
 *         &lt;element name="PermissionGroups" type="{xmlns://www.fortifysoftware.com/schema/seed}PermissionGroupList" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{xmlns://www.fortifysoftware.com/schema/seed}PermissionTemplateList" minOccurs="0"/>
 *         &lt;element name="Users" type="{xmlns://www.fortifysoftware.com/schema/seed}UserList" minOccurs="0"/>
 *         &lt;element name="Personas" type="{xmlns://www.fortifysoftware.com/schema/seed}PersonaList" minOccurs="0"/>
 *         &lt;element name="ReportLibraries" type="{xmlns://www.fortifysoftware.com/schema/seed}ReportLibraryList" minOccurs="0"/>
 *         &lt;element name="ReportDefinitions" type="{xmlns://www.fortifysoftware.com/schema/seed}ReportDefinitionList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{xmlns://www.fortifysoftware.com/schema/seed}AttributeList" minOccurs="0"/>
 *         &lt;element name="SystemVariablesAndPerformanceIndicators" type="{xmlns://www.fortifysoftware.com/schema/seed}PerformanceVariableDefinitionList" minOccurs="0"/>
 *         &lt;element name="ProjectTemplates" type="{xmlns://www.fortifysoftware.com/schema/seed}ProjectTemplateList" minOccurs="0"/>
 *         &lt;element name="ProjectVersionList" type="{xmlns://www.fortifysoftware.com/schema/seed}ProjectVersionsList" minOccurs="0"/>
 *         &lt;element name="ProjectHistoryList" type="{xmlns://www.fortifysoftware.com/schema/seed}ProjectHistoryList" minOccurs="0"/>
 *         &lt;element name="SDLBundles" type="{xmlns://www.fortifysoftware.com/schema/seed}SDLBundleList" minOccurs="0"/>
 *         &lt;element name="RuntimeObjects" type="{xmlns://www.fortifysoftware.com/schema/seed}RuntimeObjectList" minOccurs="0"/>
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/wsTypes}IssueCorrelationStrategies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "global",
    "bootstrap",
    "permissionGroups",
    "permissions",
    "users",
    "personas",
    "reportLibraries",
    "reportDefinitions",
    "attributes",
    "systemVariablesAndPerformanceIndicators",
    "projectTemplates",
    "projectVersionList",
    "projectHistoryList",
    "sdlBundles",
    "runtimeObjects",
    "issueCorrelationStrategies"
})
@XmlRootElement(name = "SeedRoot")
public class SeedRoot {

    @XmlElement(name = "Global")
    protected F360Global global;
    @XmlElement(name = "Bootstrap")
    protected Bootstrap bootstrap;
    @XmlElement(name = "PermissionGroups")
    protected PermissionGroupList permissionGroups;
    @XmlElement(name = "Permissions")
    protected PermissionTemplateList permissions;
    @XmlElement(name = "Users")
    protected UserList users;
    @XmlElement(name = "Personas")
    protected PersonaList personas;
    @XmlElement(name = "ReportLibraries")
    protected ReportLibraryList reportLibraries;
    @XmlElement(name = "ReportDefinitions")
    protected ReportDefinitionList reportDefinitions;
    @XmlElement(name = "Attributes")
    protected AttributeList attributes;
    @XmlElement(name = "SystemVariablesAndPerformanceIndicators")
    protected PerformanceVariableDefinitionList systemVariablesAndPerformanceIndicators;
    @XmlElement(name = "ProjectTemplates")
    protected ProjectTemplateList projectTemplates;
    @XmlElement(name = "ProjectVersionList")
    protected ProjectVersionsList projectVersionList;
    @XmlElement(name = "ProjectHistoryList")
    protected ProjectHistoryList projectHistoryList;
    @XmlElement(name = "SDLBundles")
    protected SdlBundleList sdlBundles;
    @XmlElement(name = "RuntimeObjects")
    protected RuntimeObjectList runtimeObjects;
    @XmlElement(name = "IssueCorrelationStrategies", namespace = "xmlns://www.fortifysoftware.com/schema/wsTypes")
    protected IssueCorrelationStrategies issueCorrelationStrategies;

    /**
     * Default no-arg constructor
     * 
     */
    public SeedRoot() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeedRoot(final F360Global global, final Bootstrap bootstrap, final PermissionGroupList permissionGroups, final PermissionTemplateList permissions, final UserList users, final PersonaList personas, final ReportLibraryList reportLibraries, final ReportDefinitionList reportDefinitions, final AttributeList attributes, final PerformanceVariableDefinitionList systemVariablesAndPerformanceIndicators, final ProjectTemplateList projectTemplates, final ProjectVersionsList projectVersionList, final ProjectHistoryList projectHistoryList, final SdlBundleList sdlBundles, final RuntimeObjectList runtimeObjects, final IssueCorrelationStrategies issueCorrelationStrategies) {
        this.global = global;
        this.bootstrap = bootstrap;
        this.permissionGroups = permissionGroups;
        this.permissions = permissions;
        this.users = users;
        this.personas = personas;
        this.reportLibraries = reportLibraries;
        this.reportDefinitions = reportDefinitions;
        this.attributes = attributes;
        this.systemVariablesAndPerformanceIndicators = systemVariablesAndPerformanceIndicators;
        this.projectTemplates = projectTemplates;
        this.projectVersionList = projectVersionList;
        this.projectHistoryList = projectHistoryList;
        this.sdlBundles = sdlBundles;
        this.runtimeObjects = runtimeObjects;
        this.issueCorrelationStrategies = issueCorrelationStrategies;
    }

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link F360Global }
     *     
     */
    public F360Global getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link F360Global }
     *     
     */
    public void setGlobal(F360Global value) {
        this.global = value;
    }

    /**
     * Gets the value of the bootstrap property.
     * 
     * @return
     *     possible object is
     *     {@link Bootstrap }
     *     
     */
    public Bootstrap getBootstrap() {
        return bootstrap;
    }

    /**
     * Sets the value of the bootstrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bootstrap }
     *     
     */
    public void setBootstrap(Bootstrap value) {
        this.bootstrap = value;
    }

    /**
     * Gets the value of the permissionGroups property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionGroupList }
     *     
     */
    public PermissionGroupList getPermissionGroups() {
        return permissionGroups;
    }

    /**
     * Sets the value of the permissionGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionGroupList }
     *     
     */
    public void setPermissionGroups(PermissionGroupList value) {
        this.permissionGroups = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionTemplateList }
     *     
     */
    public PermissionTemplateList getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionTemplateList }
     *     
     */
    public void setPermissions(PermissionTemplateList value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link UserList }
     *     
     */
    public UserList getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserList }
     *     
     */
    public void setUsers(UserList value) {
        this.users = value;
    }

    /**
     * Gets the value of the personas property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaList }
     *     
     */
    public PersonaList getPersonas() {
        return personas;
    }

    /**
     * Sets the value of the personas property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaList }
     *     
     */
    public void setPersonas(PersonaList value) {
        this.personas = value;
    }

    /**
     * Gets the value of the reportLibraries property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLibraryList }
     *     
     */
    public ReportLibraryList getReportLibraries() {
        return reportLibraries;
    }

    /**
     * Sets the value of the reportLibraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLibraryList }
     *     
     */
    public void setReportLibraries(ReportLibraryList value) {
        this.reportLibraries = value;
    }

    /**
     * Gets the value of the reportDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinitionList }
     *     
     */
    public ReportDefinitionList getReportDefinitions() {
        return reportDefinitions;
    }

    /**
     * Sets the value of the reportDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinitionList }
     *     
     */
    public void setReportDefinitions(ReportDefinitionList value) {
        this.reportDefinitions = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeList }
     *     
     */
    public AttributeList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeList }
     *     
     */
    public void setAttributes(AttributeList value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the systemVariablesAndPerformanceIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceVariableDefinitionList }
     *     
     */
    public PerformanceVariableDefinitionList getSystemVariablesAndPerformanceIndicators() {
        return systemVariablesAndPerformanceIndicators;
    }

    /**
     * Sets the value of the systemVariablesAndPerformanceIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceVariableDefinitionList }
     *     
     */
    public void setSystemVariablesAndPerformanceIndicators(PerformanceVariableDefinitionList value) {
        this.systemVariablesAndPerformanceIndicators = value;
    }

    /**
     * Gets the value of the projectTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTemplateList }
     *     
     */
    public ProjectTemplateList getProjectTemplates() {
        return projectTemplates;
    }

    /**
     * Sets the value of the projectTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTemplateList }
     *     
     */
    public void setProjectTemplates(ProjectTemplateList value) {
        this.projectTemplates = value;
    }

    /**
     * Gets the value of the projectVersionList property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectVersionsList }
     *     
     */
    public ProjectVersionsList getProjectVersionList() {
        return projectVersionList;
    }

    /**
     * Sets the value of the projectVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectVersionsList }
     *     
     */
    public void setProjectVersionList(ProjectVersionsList value) {
        this.projectVersionList = value;
    }

    /**
     * Gets the value of the projectHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHistoryList }
     *     
     */
    public ProjectHistoryList getProjectHistoryList() {
        return projectHistoryList;
    }

    /**
     * Sets the value of the projectHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHistoryList }
     *     
     */
    public void setProjectHistoryList(ProjectHistoryList value) {
        this.projectHistoryList = value;
    }

    /**
     * Gets the value of the sdlBundles property.
     * 
     * @return
     *     possible object is
     *     {@link SdlBundleList }
     *     
     */
    public SdlBundleList getSdlBundles() {
        return sdlBundles;
    }

    /**
     * Sets the value of the sdlBundles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdlBundleList }
     *     
     */
    public void setSdlBundles(SdlBundleList value) {
        this.sdlBundles = value;
    }

    /**
     * Gets the value of the runtimeObjects property.
     * 
     * @return
     *     possible object is
     *     {@link RuntimeObjectList }
     *     
     */
    public RuntimeObjectList getRuntimeObjects() {
        return runtimeObjects;
    }

    /**
     * Sets the value of the runtimeObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuntimeObjectList }
     *     
     */
    public void setRuntimeObjects(RuntimeObjectList value) {
        this.runtimeObjects = value;
    }

    /**
     * Gets the value of the issueCorrelationStrategies property.
     * 
     * @return
     *     possible object is
     *     {@link IssueCorrelationStrategies }
     *     
     */
    public IssueCorrelationStrategies getIssueCorrelationStrategies() {
        return issueCorrelationStrategies;
    }

    /**
     * Sets the value of the issueCorrelationStrategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueCorrelationStrategies }
     *     
     */
    public void setIssueCorrelationStrategies(IssueCorrelationStrategies value) {
        this.issueCorrelationStrategies = value;
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

    public SeedRoot withGlobal(F360Global value) {
        setGlobal(value);
        return this;
    }

    public SeedRoot withBootstrap(Bootstrap value) {
        setBootstrap(value);
        return this;
    }

    public SeedRoot withPermissionGroups(PermissionGroupList value) {
        setPermissionGroups(value);
        return this;
    }

    public SeedRoot withPermissions(PermissionTemplateList value) {
        setPermissions(value);
        return this;
    }

    public SeedRoot withUsers(UserList value) {
        setUsers(value);
        return this;
    }

    public SeedRoot withPersonas(PersonaList value) {
        setPersonas(value);
        return this;
    }

    public SeedRoot withReportLibraries(ReportLibraryList value) {
        setReportLibraries(value);
        return this;
    }

    public SeedRoot withReportDefinitions(ReportDefinitionList value) {
        setReportDefinitions(value);
        return this;
    }

    public SeedRoot withAttributes(AttributeList value) {
        setAttributes(value);
        return this;
    }

    public SeedRoot withSystemVariablesAndPerformanceIndicators(PerformanceVariableDefinitionList value) {
        setSystemVariablesAndPerformanceIndicators(value);
        return this;
    }

    public SeedRoot withProjectTemplates(ProjectTemplateList value) {
        setProjectTemplates(value);
        return this;
    }

    public SeedRoot withProjectVersionList(ProjectVersionsList value) {
        setProjectVersionList(value);
        return this;
    }

    public SeedRoot withProjectHistoryList(ProjectHistoryList value) {
        setProjectHistoryList(value);
        return this;
    }

    public SeedRoot withSdlBundles(SdlBundleList value) {
        setSdlBundles(value);
        return this;
    }

    public SeedRoot withRuntimeObjects(RuntimeObjectList value) {
        setRuntimeObjects(value);
        return this;
    }

    public SeedRoot withIssueCorrelationStrategies(IssueCorrelationStrategies value) {
        setIssueCorrelationStrategies(value);
        return this;
    }

}
