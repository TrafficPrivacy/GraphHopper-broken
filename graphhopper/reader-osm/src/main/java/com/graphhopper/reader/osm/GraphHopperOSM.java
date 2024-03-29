/*
 *  Licensed to GraphHopper GmbH under one or more contributor
 *  license agreements. See the NOTICE file distributed with this work for 
 *  additional information regarding copyright ownership.
 * 
 *  GraphHopper GmbH licenses this file to you under the Apache License, 
 *  Version 2.0 (the "License"); you may not use this file except in 
 *  compliance with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.reader.osm;

import com.graphhopper.GraphHopper;
import com.graphhopper.reader.DataReader;
import com.graphhopper.storage.GraphHopperStorage;

/**
 * This class is the simplified entry to all functionality if you import from OpenStreetMap data.
 *
 * @author Peter Karich
 */
public class GraphHopperOSM extends GraphHopper {
    @Override
    
    protected DataReader createReader(GraphHopperStorage ghStorage) {
        return initDataReader(new OSMReader(ghStorage));
    }

    public String getOSMFile() {
        return getDataReaderFile();
    }
    
    
    /**
     * This file can be an osm xml (.osm), a compressed xml (.osm.zip or .osm.gz) or a protobuf file
     * (.pbf).
     */
    public GraphHopperOSM setOSMFile(String osmFileStr) {
        super.setDataReaderFile(osmFileStr);
        return this;
    }
}

