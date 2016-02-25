package com.naio.mmeteopersistence.common;


import java.io.Serializable;
import java.util.Date;
import org.apache.log4j.Logger;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;


/**
 * Class DatabaseInterceptor Astrium (c), 2013
 */
public class DatabaseInterceptor extends EmptyInterceptor
{

    /** Field log of type {@link Logger} */
    public static final Logger LOG = Logger.getLogger(DatabaseInterceptor.class);

    /** Field serialVersionUID of type {@link long} */
    private static final long serialVersionUID = 1L;

    /**
     * default constructor.
     * 
     */
    public DatabaseInterceptor()
    {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hibernate.EmptyInterceptor#onSave(java.lang.Object, java.io.Serializable, java.lang.Object[],
     * java.lang.String[], org.hibernate.type.Type[])
     */
    @Override
    public boolean onSave(
        final Object entity, final Serializable id, final Object[] state, final String[] propertyNames,
        final Type[] types)
    {

        if (entity instanceof BaseEntity)
        {
            final Date now = new Date();

            for (int i = 0; i < propertyNames.length; i++)
            {
                if (BaseEntity.PROP_CREATION_TIMESTAMP.equals(propertyNames[i]))
                {
                    if (state[i] == null)
                    {
                        state[i] = now.getTime();
                    }
                }

                if (BaseEntity.PROP_MODIFICATION_TIMESTAMP.equals(propertyNames[i]))
                {
                    state[i] = now.getTime();
                }
            }

            return true;
        }

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hibernate.EmptyInterceptor#onFlushDirty(java.lang.Object, java.io.Serializable, java.lang.Object[],
     * java.lang.Object[], java.lang.String[], org.hibernate.type.Type[])
     */
    @Override
    public boolean onFlushDirty(
        final java.lang.Object entity, final java.io.Serializable id, final java.lang.Object[] currentState,
        final java.lang.Object[] previousState, final java.lang.String[] propertyNames,
        final org.hibernate.type.Type[] types)
    {
        if (entity instanceof BaseEntity)
        {
            final Date now = new Date();

            for (int i = 0; i < propertyNames.length; i++)
            {
                if (BaseEntity.PROP_CREATION_TIMESTAMP.equals(propertyNames[i]))
                {
                    if (currentState[i] == null)
                    {
                        currentState[i] = now.getTime();
                    }
                }

                if (BaseEntity.PROP_MODIFICATION_TIMESTAMP.equals(propertyNames[i]))
                {
                    currentState[i] = now.getTime();
                }
            }

            return true;
        }

        return false;
    }
}

