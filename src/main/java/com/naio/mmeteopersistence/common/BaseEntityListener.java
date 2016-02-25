package com.naio.mmeteopersistence.common;


import java.util.Date;
import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;


/**
 * Class BaseEntityListener Astrium (c), 2013
 */
public class BaseEntityListener implements PreInsertEventListener, PreUpdateEventListener
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * default constructor.
     * 
     */
    public BaseEntityListener()
    {
        super();
    }

    /**
     * Define state of an entity property
     * 
     * @param propertyStates Object array of properties state
     * @param propertyNames String array of properties names
     * @param propertyName String for a property name
     * @param propertyState Object for a property state
     */
    private void setPropertyState(
        final Object[] propertyStates, final String[] propertyNames, final String propertyName,
        final Object propertyState)
    {
        for (int i = 0; i < propertyNames.length; i++)
        {
            if (propertyName.equals(propertyNames[i]))
            {
                propertyStates[i] = propertyState;

                return;
            }
        }
    }

    /**
     * Internal method called on PreInsertEventListener.onPreInsert event
     * 
     * @param entity Object to insert
     * @param state Object array of entity state
     * @param propertyNames String array of property names
     */
    private void onInsert(final Object entity, final Object[] state, final String[] propertyNames)
    {
        if (entity instanceof BaseEntity)
        {
            final BaseEntity baseEntity = (BaseEntity) entity;

            // Long utcTime =
            // Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
            final Long utcTime = DateUtil.getCurrentUTCTime();
            final Date now = new Date();

            // baseEntity.setCreationTimestamp(utcTime);
            baseEntity.setCreationTimestamp(now.getTime());
            this.setPropertyState(state, propertyNames, BaseEntity.PROP_CREATION_TIMESTAMP, utcTime);

            // baseEntity.setModificationTimestamp(utcTime);
            baseEntity.setModificationTimestamp(now.getTime());
            this.setPropertyState(state, propertyNames, BaseEntity.PROP_MODIFICATION_TIMESTAMP, utcTime);
        }
    }

    /**
     * Internal method called during onPreUpdate event of PreUpdateEventListener
     * 
     * @param entity entity to update
     * @param state Object array of state
     * @param propertyNames String array of property names
     */
    private void onUpdate(final Object entity, final Object[] state, final String[] propertyNames)
    {
        if (entity instanceof BaseEntity)
        {
            final BaseEntity baseEntity = (BaseEntity) entity;

            // Long utcTime =
            // Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
            final Long utcTime = DateUtil.getCurrentUTCTime();
            final Date now = new Date();

            // baseEntity.setModificationTimestamp(utcTime);
            baseEntity.setModificationTimestamp(now.getTime());
            this.setPropertyState(state, propertyNames, BaseEntity.PROP_MODIFICATION_TIMESTAMP, utcTime);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hibernate.event.spi.PreInsertEventListener#onPreInsert(org.hibernate.event.spi.PreInsertEvent)
     */
    @Override
    public boolean onPreInsert(final PreInsertEvent event)
    {
        this.onInsert(event.getEntity(), event.getState(), event.getPersister().getPropertyNames());

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hibernate.event.spi.PreUpdateEventListener#onPreUpdate(org.hibernate.event.spi.PreUpdateEvent)
     */
    @Override
    public boolean onPreUpdate(final PreUpdateEvent event)
    {
        this.onUpdate(event.getEntity(), event.getState(), event.getPersister().getPropertyNames());

        return false;
    }
}
