/*
 * Copyright (C) 2003-2014 eXo Platform SAS.
 *
 * This file is part of Sample Spring MVC Portlet.
 *
 * Sample Spring MVC Portlet is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * Sample Spring MVC Portlet software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sample Spring MVC Portlet; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.addons.portlets.springmvc;

import java.util.Collection;

public interface ContactService {
  public Collection<Contact> getContacts();

  public Contact getContactById(Long id);

  public void createContact(Contact contact);

  public void updateContact(Contact contact);

  public void deleteContact(Contact contact);
}
