/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.core.manager;

import org.orcid.jaxb.model.record_rc2.Address;

/**
 * 
 * @author Angel Montenegro
 * 
 */
public interface AddressManager {
    Address getPrimaryAddress(String orcid);
    
    Address getAddress(String orcid, Long putCode);

    Address updateAddress(String orcid, Long putCode, Address address, boolean isUserUpdating);

    Address createAddress(String orcid, Address address);

    boolean deleteAddress(String orcid, Long putCode);
}
