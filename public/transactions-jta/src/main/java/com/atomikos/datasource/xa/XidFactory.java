/**
 * Copyright (C) 2000-2023 Atomikos <info@atomikos.com>
 *
 * LICENSE CONDITIONS
 *
 * See http://www.atomikos.com/Main/WhichLicenseApplies for details.
 */

package com.atomikos.datasource.xa;


/**
 * 
 * 
 * A factory for creating new Xid instances. This allows different factories for
 * different resources, which is needed because some resources need a custom Xid
 * format.
 */

public interface XidFactory
{
    /**
     * Creates a new Xid instance for a given composite transaction id and
     * branch identifier.
     * 
     * @param tid
     * @param branchIdentifier
     * @param uniqueResourceName
     */

    public XID createXid (String tid , String branchIdentifier, String uniqueResourceName);
}
