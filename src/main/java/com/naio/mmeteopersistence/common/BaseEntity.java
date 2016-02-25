package com.naio.mmeteopersistence.common;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;


/**
 * Class BaseEntity Astrium (c), 2013
 */
@MappedSuperclass
public class BaseEntity implements Serializable
{
    /** PROP_CREATION_TIMESTAMP */
    public static final String PROP_CREATION_TIMESTAMP = "creationTimestamp";
    
    /** PROP_ID */
    public static final String PROP_ID = "id";
    
    /** PROP_MODIFICATION_TIMESTAMP */
    public static final String PROP_MODIFICATION_TIMESTAMP = "modificationTimestamp";
    
    /** PROP_OWNER */
    public static final String PROP_OWNER = "owner";
    
    /** PROP_VERSION */
    public static final String PROP_VERSION = "version";

    
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** id */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = BaseEntity.PROP_ID, unique = true, length = 36)
    private String id;

    /** version */
    @Column(name = BaseEntity.PROP_VERSION)
    @Version
    private Long version;

    /** creationTimestamp */
    @Column(name = BaseEntity.PROP_CREATION_TIMESTAMP)
    private Long creationTimestamp;

    /** modificationTimestamp */
    @Column(name = BaseEntity.PROP_MODIFICATION_TIMESTAMP)
    private Long modificationTimestamp;

    /** owner */
    @Column(name = BaseEntity.PROP_OWNER)
    private String owner;
    
    /**
     * default constructor.
     * 
     */
    public BaseEntity()
    {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.creationTimestamp == null) ? 0 : this.creationTimestamp.hashCode());
        result = (prime * result) + ((this.id == null) ? 0 : this.id.hashCode());
        result = (prime * result) + ((this.modificationTimestamp == null) ? 0 : this.modificationTimestamp.hashCode());
        result = (prime * result) + ((this.owner == null) ? 0 : this.owner.hashCode());
        result = (prime * result) + ((this.version == null) ? 0 : this.version.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final BaseEntity other = (BaseEntity) obj;
        if (this.creationTimestamp == null)
        {
            if (other.creationTimestamp != null)
            {
                return false;
            }
        }
        else if (!this.creationTimestamp.equals(other.creationTimestamp))
        {
            return false;
        }
        if (this.id == null)
        {
            if (other.id != null)
            {
                return false;
            }
        }
        else if (!this.id.equals(other.id))
        {
            return false;
        }
        if (this.modificationTimestamp == null)
        {
            if (other.modificationTimestamp != null)
            {
                return false;
            }
        }
        else if (!this.modificationTimestamp.equals(other.modificationTimestamp))
        {
            return false;
        }
        if (this.owner == null)
        {
            if (other.owner != null)
            {
                return false;
            }
        }
        else if (!this.owner.equals(other.owner))
        {
            return false;
        }
        if (this.version == null)
        {
            if (other.version != null)
            {
                return false;
            }
        }
        else if (!this.version.equals(other.version))
        {
            return false;
        }
        return true;
    }

    /**
     * Getter of BaseEntity.id
     * 
     * @return Returns the id of type {@link String}.
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Getter of BaseEntity.version
     * 
     * @return Returns the version of type {@link Long}.
     */
    public Long getVersion()
    {
        return this.version;
    }

    /**
     * Getter of BaseEntity.creationTimestamp
     * 
     * @return Returns the creationTimestamp of type {@link Long}.
     */
    public Long getCreationTimestamp()
    {
        return this.creationTimestamp;
    }

    /**
     * Getter of BaseEntity.modificationTimestamp
     * 
     * @return Returns the modificationTimestamp of type {@link Long}.
     */
    public Long getModificationTimestamp()
    {
        return this.modificationTimestamp;
    }

    /**
     * Getter of BaseEntity.owner
     * 
     * @return Returns the owner of type {@link String}.
     */
    public String getOwner()
    {
        return this.owner;
    }

    /**
     * Setter of BaseEntity.id
     * 
     * @param pId The id to set with {@link String}.
     */
    public void setId(final String pId)
    {
        this.id = pId;
    }

    /**
     * Setter of BaseEntity.version
     * 
     * @param pVersion The version to set with {@link Long}.
     */
    public void setVersion(final Long pVersion)
    {
        this.version = pVersion;
    }

    /**
     * Setter of BaseEntity.creationTimestamp
     * 
     * @param pCreationTimestamp The creationTimestamp to set with {@link Long}.
     */
    public void setCreationTimestamp(final Long pCreationTimestamp)
    {
        this.creationTimestamp = pCreationTimestamp;
    }

    /**
     * Setter of BaseEntity.modificationTimestamp
     * 
     * @param pModificationTimestamp The modificationTimestamp to set with {@link Long}.
     */
    public void setModificationTimestamp(final Long pModificationTimestamp)
    {
        this.modificationTimestamp = pModificationTimestamp;
    }

    /**
     * Setter of BaseEntity.owner
     * 
     * @param pOwner The owner to set with {@link String}.
     */
    public void setOwner(final String pOwner)
    {
        this.owner = pOwner;
    }
}