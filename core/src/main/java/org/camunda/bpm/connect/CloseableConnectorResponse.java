/* Licensed under the Apache License, Version 2.0 (the "License");
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
 */
package org.camunda.bpm.connect;

/**
 * <p>A connector response which represents an open resource (link to open resource)
 * which must be closed. Consumers of this API are responsible to close the request.
 * A generic connector consumer (such as the camunda process engine) should check
 * whether </p>
 *
 * @author Daniel Meyer
 *
 */
public interface CloseableConnectorResponse extends ConnectorResponse {

  public void close();

}