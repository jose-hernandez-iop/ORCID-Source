//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.02 at 04:23:52 PM BST 
//

package org.orcid.jaxb.model.v3.release.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.orcid.jaxb.model.common.ContributorRole;
import org.orcid.jaxb.model.common.SequenceType;
import org.orcid.jaxb.model.common.adapters.ContributorRoleAdapter;
import org.orcid.jaxb.model.common.adapters.SequenceTypeAdapter;

import io.swagger.annotations.ApiModel;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "contributorSequence", "contributorRole" })
@XmlRootElement(name = "contributor-attributes")
@ApiModel(value = "ContributorAttributesV3_0")
public class ContributorAttributes implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlJavaTypeAdapter(SequenceTypeAdapter.class)
    @XmlElement(name = "contributor-sequence", namespace = "http://www.orcid.org/ns/work", required = true)
    protected SequenceType contributorSequence;
    @XmlJavaTypeAdapter(ContributorRoleAdapter.class)
    @XmlElement(name = "contributor-role", namespace = "http://www.orcid.org/ns/work", required = true)
    protected ContributorRole contributorRole;

    /**
     * Gets the value of the contributorSequence property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public SequenceType getContributorSequence() {
        return contributorSequence;
    }

    /**
     * Sets the value of the contributorSequence property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContributorSequence(SequenceType value) {
        this.contributorSequence = value;
    }

    /**
     * Gets the value of the contributorRole property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public ContributorRole getContributorRole() {
        return contributorRole;
    }

    /**
     * Sets the value of the contributorRole property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContributorRole(ContributorRole value) {
        this.contributorRole = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContributorAttributes)) {
            return false;
        }

        ContributorAttributes that = (ContributorAttributes) o;

        if (contributorRole != that.contributorRole) {
            return false;
        }
        if (contributorSequence != that.contributorSequence) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = contributorSequence != null ? contributorSequence.hashCode() : 0;
        result = 31 * result + (contributorRole != null ? contributorRole.hashCode() : 0);
        return result;
    }
}
