/*
 *     Copyright 2021 uJar Boot Camp @ http://ujar.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ujar.beginner.learn.howto.simply.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(name = "Hello", targetNamespace = "http://wsserver/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Hello {
  /**
   * @param arg0
   * @return returns java.lang.String
   */
  @WebMethod
  @WebResult(partName = "return")
  public String sayHello(
      @WebParam(name = "arg0", partName = "arg0")
          String arg0);
}
