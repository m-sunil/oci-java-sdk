/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

/**
 * Simple interface to associate something that should be done with a
 * setup/teardown lifecycle in unit tests.
 */
public interface TestResource {
    /**
     * Execute before running tests.
     */
    void before() throws Exception;

    /**
     * Execute after test completes.
     */
    void after() throws Exception;
}
