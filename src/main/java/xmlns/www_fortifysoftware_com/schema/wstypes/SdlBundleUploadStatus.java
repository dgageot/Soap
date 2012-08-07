
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for SDLBundleUploadStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDLBundleUploadStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element name="versionConflictError" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ObjectIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lockedObjectError" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ObjectIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameConflictError" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ObjectIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherError" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}GenericError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDLBundleUploadStatus", propOrder = {
    "versionConflictError",
    "lockedObjectError",
    "nameConflictError",
    "otherError"
})
public class SdlBundleUploadStatus
    extends Status
{

    protected List<ObjectIdentifier> versionConflictError;
    protected List<ObjectIdentifier> lockedObjectError;
    protected List<ObjectIdentifier> nameConflictError;
    protected List<GenericError> otherError;

    /**
     * Default no-arg constructor
     * 
     */
    public SdlBundleUploadStatus() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SdlBundleUploadStatus(final long code, final String msg, final List<RootCause> rootCause, final List<ObjectIdentifier> versionConflictError, final List<ObjectIdentifier> lockedObjectError, final List<ObjectIdentifier> nameConflictError, final List<GenericError> otherError) {
        super(code, msg, rootCause);
        this.versionConflictError = versionConflictError;
        this.lockedObjectError = lockedObjectError;
        this.nameConflictError = nameConflictError;
        this.otherError = otherError;
    }

    /**
     * Gets the value of the versionConflictError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionConflictError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionConflictError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifier }
     * 
     * 
     */
    public List<ObjectIdentifier> getVersionConflictError() {
        if (versionConflictError == null) {
            versionConflictError = new ArrayList<ObjectIdentifier>();
        }
        return this.versionConflictError;
    }

    /**
     * Gets the value of the lockedObjectError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lockedObjectError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockedObjectError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifier }
     * 
     * 
     */
    public List<ObjectIdentifier> getLockedObjectError() {
        if (lockedObjectError == null) {
            lockedObjectError = new ArrayList<ObjectIdentifier>();
        }
        return this.lockedObjectError;
    }

    /**
     * Gets the value of the nameConflictError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameConflictError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameConflictError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifier }
     * 
     * 
     */
    public List<ObjectIdentifier> getNameConflictError() {
        if (nameConflictError == null) {
            nameConflictError = new ArrayList<ObjectIdentifier>();
        }
        return this.nameConflictError;
    }

    /**
     * Gets the value of the otherError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericError }
     * 
     * 
     */
    public List<GenericError> getOtherError() {
        if (otherError == null) {
            otherError = new ArrayList<GenericError>();
        }
        return this.otherError;
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
     * Sets the value of the versionConflictError property.
     * 
     * @param versionConflictError
     *     allowed object is
     *     {@link ObjectIdentifier }
     *     
     */
    public void setVersionConflictError(List<ObjectIdentifier> versionConflictError) {
        this.versionConflictError = versionConflictError;
    }

    /**
     * Sets the value of the lockedObjectError property.
     * 
     * @param lockedObjectError
     *     allowed object is
     *     {@link ObjectIdentifier }
     *     
     */
    public void setLockedObjectError(List<ObjectIdentifier> lockedObjectError) {
        this.lockedObjectError = lockedObjectError;
    }

    /**
     * Sets the value of the nameConflictError property.
     * 
     * @param nameConflictError
     *     allowed object is
     *     {@link ObjectIdentifier }
     *     
     */
    public void setNameConflictError(List<ObjectIdentifier> nameConflictError) {
        this.nameConflictError = nameConflictError;
    }

    /**
     * Sets the value of the otherError property.
     * 
     * @param otherError
     *     allowed object is
     *     {@link GenericError }
     *     
     */
    public void setOtherError(List<GenericError> otherError) {
        this.otherError = otherError;
    }

    public SdlBundleUploadStatus withVersionConflictError(ObjectIdentifier... values) {
        if (values!= null) {
            for (ObjectIdentifier value: values) {
                getVersionConflictError().add(value);
            }
        }
        return this;
    }

    public SdlBundleUploadStatus withVersionConflictError(Collection<ObjectIdentifier> values) {
        if (values!= null) {
            getVersionConflictError().addAll(values);
        }
        return this;
    }

    public SdlBundleUploadStatus withLockedObjectError(ObjectIdentifier... values) {
        if (values!= null) {
            for (ObjectIdentifier value: values) {
                getLockedObjectError().add(value);
            }
        }
        return this;
    }

    public SdlBundleUploadStatus withLockedObjectError(Collection<ObjectIdentifier> values) {
        if (values!= null) {
            getLockedObjectError().addAll(values);
        }
        return this;
    }

    public SdlBundleUploadStatus withNameConflictError(ObjectIdentifier... values) {
        if (values!= null) {
            for (ObjectIdentifier value: values) {
                getNameConflictError().add(value);
            }
        }
        return this;
    }

    public SdlBundleUploadStatus withNameConflictError(Collection<ObjectIdentifier> values) {
        if (values!= null) {
            getNameConflictError().addAll(values);
        }
        return this;
    }

    public SdlBundleUploadStatus withOtherError(GenericError... values) {
        if (values!= null) {
            for (GenericError value: values) {
                getOtherError().add(value);
            }
        }
        return this;
    }

    public SdlBundleUploadStatus withOtherError(Collection<GenericError> values) {
        if (values!= null) {
            getOtherError().addAll(values);
        }
        return this;
    }

    public SdlBundleUploadStatus withVersionConflictError(List<ObjectIdentifier> versionConflictError) {
        setVersionConflictError(versionConflictError);
        return this;
    }

    public SdlBundleUploadStatus withLockedObjectError(List<ObjectIdentifier> lockedObjectError) {
        setLockedObjectError(lockedObjectError);
        return this;
    }

    public SdlBundleUploadStatus withNameConflictError(List<ObjectIdentifier> nameConflictError) {
        setNameConflictError(nameConflictError);
        return this;
    }

    public SdlBundleUploadStatus withOtherError(List<GenericError> otherError) {
        setOtherError(otherError);
        return this;
    }

    @Override
    public SdlBundleUploadStatus withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SdlBundleUploadStatus withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SdlBundleUploadStatus withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SdlBundleUploadStatus withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SdlBundleUploadStatus withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}
