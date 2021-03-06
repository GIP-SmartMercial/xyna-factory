/*
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * Copyright 2022 GIP SmartMercial GmbH, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 */
package com.gip.xyna.xact.trigger.snmp;

import com.gip.xyna.utils.exceptions.ExceptionStorage;
import com.gip.xyna.xact.exceptions.XACT_TriggerCouldNotBeStartedException;
import java.util.List;

//DO NOT CHANGE
//GENERATED BY com.gip.xyna.utils.exceptions.utils.codegen.JavaClass 2015-08-06T10:34:24Z;
public class SNMPTRIGGER_InterfaceNotFoundException extends XACT_TriggerCouldNotBeStartedException {

  static {
    {
      ExceptionStorage.loadFromResource("Exceptions.xml", SNMPTRIGGER_InterfaceNotFoundException.class.getClassLoader());
    }
  }

  private String interfaceName;

  public SNMPTRIGGER_InterfaceNotFoundException(String interfaceName) {
    super(new String[]{"XYNA-09650", interfaceName + ""});
    setInterfaceName(interfaceName);
  }

  public SNMPTRIGGER_InterfaceNotFoundException(String interfaceName, Throwable cause) {
    super(new String[]{"XYNA-09650", interfaceName + ""}, cause);
    setInterfaceName(interfaceName);
  }

  protected SNMPTRIGGER_InterfaceNotFoundException(String[] args) {
    super(args);
  }

  protected SNMPTRIGGER_InterfaceNotFoundException(String[] args, Throwable cause) {
    super(args, cause);
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  public String getInterfaceName() {
    return interfaceName;
  }

  public SNMPTRIGGER_InterfaceNotFoundException initCause(Throwable t) {
    return (SNMPTRIGGER_InterfaceNotFoundException) super.initCause(t);
  }


}
