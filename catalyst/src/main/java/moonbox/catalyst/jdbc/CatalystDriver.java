/*-
 * <<
 * Moonbox
 * ==
 * Copyright (C) 2016 - 2018 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */

package moonbox.catalyst.jdbc;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class CatalystDriver implements Driver  {

  public Connection connect(String url, Properties info) throws SQLException {
    return null;
  }

  public boolean acceptsURL(String url) throws SQLException {
    return false;
  }

  public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
    return new DriverPropertyInfo[0];
  }

  public int getMajorVersion() {
    return 0;
  }

  public int getMinorVersion() {
    return 0;
  }

  public boolean jdbcCompliant() {
    return false;
  }

  public Logger getParentLogger() throws SQLFeatureNotSupportedException {
    return null;
  }
}