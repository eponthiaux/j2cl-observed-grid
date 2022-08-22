package server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shared.model.DataSet;

/**
 * Copyright 2022 Eric Ponthiaux -/- ponthiaux.eric@gmail.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@RestController
public class GridServiceImpl {

    private static final String DUNE_2022_CHARACTERS = "DUNE2022";
    private static final String DUNE_1984_CHARACTERS = "DUNE1984";

    @GetMapping("/dataset/{datasetId}")
    public DataSet dataset(@PathVariable("datasetId") String datasetId) {

        switch (datasetId) {

            case DUNE_2022_CHARACTERS:

                return getDune2022Characters();

            case DUNE_1984_CHARACTERS:

                return getDune1984Characters();

        }

        return new DataSet();

    }

    private DataSet getDune2022Characters() {

        DataSet dataSet = new DataSet();

        dataSet.title = DUNE_2022_CHARACTERS;

        return dataSet;

    }

    private DataSet getDune1984Characters() {

        DataSet dataSet = new DataSet();

        dataSet.title = DUNE_1984_CHARACTERS;

        return dataSet;

    }

}
