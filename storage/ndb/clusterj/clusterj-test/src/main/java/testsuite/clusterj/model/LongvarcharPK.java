/*
 *  Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved.
 *  Copyright (c) 2021, 2021, Logical Clocks and/or its affiliates.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License, version 2.0,
 *  as published by the Free Software Foundation.
 *
 *  This program is also distributed with certain software (including
 *  but not limited to OpenSSL) that is licensed under separate terms,
 *  as designated in a particular file or component or in included license
 *  documentation.  The authors of MySQL hereby grant you an additional
 *  permission to link the program and your derivative works with the
 *  separately licensed software that they have included with MySQL.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License, version 2.0, for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301  USA
 */

package testsuite.clusterj.model;

import com.mysql.clusterj.annotation.PersistenceCapable;

/** Schema
 *
drop table if exists longvarcharpk;
create table longvarcharpk (
 id varbinary(512) primary key not null,
 number int not null,
 name varchar(10) not null
) ENGINE=ndbcluster DEFAULT CHARSET=utf8;

 */
@PersistenceCapable(table="longvarcharpk")
public interface LongvarcharPK {

    String getId();
    void setId(String value);

    int getNumber();
    void setNumber(int value);

    String getName();
    void setName(String value);

}
