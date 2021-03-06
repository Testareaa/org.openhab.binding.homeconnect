/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.somfytahoma.handler;

import java.util.Hashtable;

/**
 * The {@link SomfyTahomaRollerShutterHandler} is interface for handlers
 * of all Somfy Tahoma things.
 *
 * @author Ondrej Pecta - Initial contribution
 */
public interface SomfyTahomaThingHandler {

    public abstract Hashtable<String, String> getStateNames();
}
