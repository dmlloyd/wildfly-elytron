/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.security.password.spec;

import org.wildfly.common.Assert;

/**
 * A {@link PasswordSpec} for a password represented by a hash with a salt and a iteration count or cost.
 *
 * @author <a href="mailto:psilva@redhat.com">Pedro Igor</a>
 */
public class IteratedSaltedHashPasswordSpec implements PasswordSpec {

    private final byte[] hash;
    private final byte[] salt;
    private final int iterationCount;

    /**
     * Construct a new instance.
     *
     * @param hash the password hash bytes
     * @param salt the salt bytes
     * @param iterationCount the iteration count
     */
    public IteratedSaltedHashPasswordSpec(byte[] hash, byte[] salt, int iterationCount) {
        Assert.checkNotNullParam("hash", hash);
        Assert.checkNotNullParam("salt", salt);
        this.hash = hash;
        this.salt = salt;
        this.iterationCount = iterationCount;
    }

    /**
     * Get a password hash bytes.
     *
     * @return the password hash
     */
    public byte[] getHash() {
        return this.hash;
    }

    /**
     * Get the salt bytes.
     *
     * @return the salt bytes
     */
    public byte[] getSalt() {
        return this.salt;
    }

    /**
     * Get the iteration count.
     *
     * @return the iteration count
     */
    public int getIterationCount() {
        return this.iterationCount;
    }
}
