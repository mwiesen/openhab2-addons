/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.miio.internal.robot;

/**
 * List of Errors
 *
 * @author Marcel Verpaalen - Initial contribution
 */
public enum FanModeType {

    SILENT(38, "Silent"),
    STANDARD(60, "Standard"),
    POWER(77, "Power"),
    FULL(90, "Full"),
    CUSTOM(-1, "Custom");

    private final int id;
    private final String description;

    FanModeType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public static FanModeType getType(int value) {
        for (FanModeType st : FanModeType.values()) {
            if (st.getId() == value) {
                return st;
            }
        }
        return CUSTOM;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Status " + Integer.toString(id) + ": " + description;
    }
}
