/*
 * Copyright (c) 2009, 2010, 2011, 2012, B3log Team
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
package org.b3log.rhythm.repository.impl;

import java.util.logging.Logger;
import org.b3log.latke.repository.AbstractRepository;
import org.b3log.rhythm.model.BroadcastChance;
import org.b3log.rhythm.repository.BroadcastChanceRepository;

/**
 * Broadcast chance repository implementation.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, Apr 15, 2013
 * @since 0.1.6
 */
public final class BroadcastChanceRepositoryImpl extends AbstractRepository
        implements BroadcastChanceRepository {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(BroadcastChanceRepositoryImpl.class.getName());

    /**
     * Gets the {@link BroadcastChanceRepositoryImpl} singleton.
     *
     * @return the singleton
     */
    public static BroadcastChanceRepositoryImpl getInstance() {
        return SingletonHolder.SINGLETON;
    }

    /**
     * Private constructor.
     * 
     * @param name the specified name
     */
    private BroadcastChanceRepositoryImpl(final String name) {
        super(name);
    }

    /**
     * Singleton holder.
     *
     * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
     * @version 1.0.0.0, Apr 15, 2013
     */
    private static final class SingletonHolder {

        /**
         * Singleton.
         */
        private static final BroadcastChanceRepositoryImpl SINGLETON = new BroadcastChanceRepositoryImpl(BroadcastChance.BROADCAST_CHANCE);

        /**
         * Private default constructor.
         */
        private SingletonHolder() {
        }
    }
}
