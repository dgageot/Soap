
package xmlns.www_fortify_com.schema.audit;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlns.www_fortify_com.schema.audit package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlns.www_fortify_com.schema.audit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link TagHistory }
     * 
     */
    public TagHistory createTagHistory() {
        return new TagHistory();
    }

    /**
     * Create an instance of {@link RemovedIssue }
     * 
     */
    public RemovedIssue createRemovedIssue() {
        return new RemovedIssue();
    }

    /**
     * Create an instance of {@link IssueList }
     * 
     */
    public IssueList createIssueList() {
        return new IssueList();
    }

    /**
     * Create an instance of {@link ThreadedComments }
     * 
     */
    public ThreadedComments createThreadedComments() {
        return new ThreadedComments();
    }

    /**
     * Create an instance of {@link CustomIssue }
     * 
     */
    public CustomIssue createCustomIssue() {
        return new CustomIssue();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Issue }
     * 
     */
    public Issue createIssue() {
        return new Issue();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link IssueBase }
     * 
     */
    public IssueBase createIssueBase() {
        return new IssueBase();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link ProjectInfo }
     * 
     */
    public ProjectInfo createProjectInfo() {
        return new ProjectInfo();
    }

}
