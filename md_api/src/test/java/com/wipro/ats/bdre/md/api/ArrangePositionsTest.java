/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wipro.ats.bdre.md.api;

import com.wipro.ats.bdre.md.beans.PositionsInfo;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Map;

public class ArrangePositionsTest {
    private static final Logger LOGGER = Logger.getLogger(ArrangePositions.class);

    @Ignore
    @Test
    public void testGetListPositionInfo() throws Exception {
        ArrangePositions arrangePositions = new ArrangePositions();
        Map<String, PositionsInfo> positionsInfoList = arrangePositions.getListPositionInfo(10802);
        for (PositionsInfo pinfo : positionsInfoList.values()) {
            LOGGER.info(pinfo.getProcessId() + " process id" + pinfo.getxPos() + "x pos" + pinfo.getyPos() + "y pos");
        }
    }
}