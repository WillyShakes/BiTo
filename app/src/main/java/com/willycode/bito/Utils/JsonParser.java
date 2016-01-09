package com.willycode.bito.Utils;

import com.willycode.bito.Data.Model.Station;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 *
 */
public class JsonParser {
    private String json = "{\n" +
            "  \"network\": {\n" +
            "    \"company\": \"Comunicare S.r.l.\",\n" +
            "    \"href\": \"/v2/networks/to-bike\",\n" +
            "    \"id\": \"to-bike\",\n" +
            "    \"location\": {\n" +
            "      \"city\": \"Torino\",\n" +
            "      \"country\": \"IT\",\n" +
            "      \"latitude\": 45.07098200000001,\n" +
            "      \"longitude\": 7.685676\n" +
            "    },\n" +
            "    \"name\": \"[TO]BIKE\",\n" +
            "    \"stations\": [\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Principe Eugenio ang. c.so Beccaria\"\n" +
            "        },\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"a2a1e27c6389b28bba4f4c3bfcf135b9\",\n" +
            "        \"latitude\": 45.077573,\n" +
            "        \"longitude\": 7.670327,\n" +
            "        \"name\": \"Paravia\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.049Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Bologna ang. via Padova\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"da567edfa7a9f6bc69c22871efb40b1d\",\n" +
            "        \"latitude\": 45.082432316396044,\n" +
            "        \"longitude\": 7.69572797853084,\n" +
            "        \"name\": \"Bologna\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.051Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza XVIII Dicembre ang. via cernaia\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"684e737c7e0502c3b6274620a03c57fb\",\n" +
            "        \"latitude\": 45.07344483974193,\n" +
            "        \"longitude\": 7.668027877807617,\n" +
            "        \"name\": \"Porta Susa 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.052Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 13,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Bolzano ang. via Ruffini\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"b04595f1d52a800d466708223c2a7b29\",\n" +
            "        \"latitude\": 45.0731417708663,\n" +
            "        \"longitude\": 7.667834758758545,\n" +
            "        \"name\": \"Porta Susa 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.053Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vinzaglio ang. Via Cernaia\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"6473a97f439b97bf3185f8e7b28cb69c\",\n" +
            "        \"latitude\": 45.072655,\n" +
            "        \"longitude\": 7.670198,\n" +
            "        \"name\": \"Cernaia\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.054Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Garibaldi ang. c.so Valdocco\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"68baba95230c8881058a9344a3596734\",\n" +
            "        \"latitude\": 45.07524806632093,\n" +
            "        \"longitude\": 7.673665881156921,\n" +
            "        \"name\": \"Valdocco 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.054Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Sacchi ang. C.so Sommeiller\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"6f52a55407dd1c22e3b5fcb73a23ee5a\",\n" +
            "        \"latitude\": 45.05519533473768,\n" +
            "        \"longitude\": 7.671646177768707,\n" +
            "        \"name\": \"Sommeiller\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.055Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Giulio ang. C.so valdocco\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"025640125a5a3b6846b558c78e65dcda\",\n" +
            "        \"latitude\": 45.07814030777308,\n" +
            "        \"longitude\": 7.675771415233612,\n" +
            "        \"name\": \"Valdocco\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.056Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via della consolata 10 / via san domenico\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"1825490441115feb4023cddf31adea7b\",\n" +
            "        \"latitude\": 45.07579241434004,\n" +
            "        \"longitude\": 7.678015447908365,\n" +
            "        \"name\": \"Consolata\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.057Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 13,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Vittorio Emanuele II 64 ang. via Arsenale\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"d6708b1813c9fbaa74f43e28725e4da9\",\n" +
            "        \"latitude\": 45.063768667440506,\n" +
            "        \"longitude\": 7.676202415086095,\n" +
            "        \"name\": \"Vittorio Emanuele II 6\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.057Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Monte di Pieta' ang. via XX Settembre\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"69405db8dd01f61096d9b108380d5043\",\n" +
            "        \"latitude\": 45.070512580923385,\n" +
            "        \"longitude\": 7.682361602783203,\n" +
            "        \"name\": \"Pietro Micca\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.058Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Corte d`Appello 11\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"6926d60ef8a950caf2817c5bfccacd9c\",\n" +
            "        \"latitude\": 45.07441464934351,\n" +
            "        \"longitude\": 7.678821086883545,\n" +
            "        \"name\": \"Corte d`Appello\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.059Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vittorio Emanuele II 107 ang. c.so Duca degli Abruzzi\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"ddbcabd9d5f823faf993f500aa794619\",\n" +
            "        \"latitude\": 45.06700428033471,\n" +
            "        \"longitude\": 7.666611671447754,\n" +
            "        \"name\": \"Vittorio Emanuele II 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.06Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Statuto ang. Via Garibaldi\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"b2221f3b0556b777fbb6626d36ef0ffc\",\n" +
            "        \"latitude\": 45.07627087963581,\n" +
            "        \"longitude\": 7.671568393707275,\n" +
            "        \"name\": \"Statuto 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.06Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so XI Febbraio ang. via Bazzi\"\n" +
            "        },\n" +
            "        \"free_bikes\": 13,\n" +
            "        \"id\": \"cf1f97c76d8f54a8858e4685a26e3138\",\n" +
            "        \"latitude\": 45.077043659776734,\n" +
            "        \"longitude\": 7.687479257583618,\n" +
            "        \"name\": \"XI Febbraio\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.061Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Novara fr. via Catania\"\n" +
            "        },\n" +
            "        \"free_bikes\": 9,\n" +
            "        \"id\": \"3344c7fa7f1807b214d229dd5a419bb2\",\n" +
            "        \"latitude\": 45.07885584167172,\n" +
            "        \"longitude\": 7.701397923029731,\n" +
            "        \"name\": \"Cimitero Monumentale\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.062Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Vittorio Emanuele II 2 ang. c.so Cairoli\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"9c1d471fd4c6961862584bf307f19abc\",\n" +
            "        \"latitude\": 45.0588147394304,\n" +
            "        \"longitude\": 7.69013051167326,\n" +
            "        \"name\": \"Cairoli\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.064Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"P.zza Arbarello\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"dbdce9d21982a3cae1d6cbcfe59749d6\",\n" +
            "        \"latitude\": 45.07356279124318,\n" +
            "        \"longitude\": 7.6765855864834975,\n" +
            "        \"name\": \"Arbarello\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.065Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 15,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Galileo Ferraris ang. via Vespucci\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"ed7aa03c995bad9eb7b14676ff821c80\",\n" +
            "        \"latitude\": 45.055348811729864,\n" +
            "        \"longitude\": 7.6639509201049805,\n" +
            "        \"name\": \"Galileo Ferraris 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.065Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 4,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vittorio Emanuele II ang. V. Sacchi\"\n" +
            "        },\n" +
            "        \"free_bikes\": 19,\n" +
            "        \"id\": \"687e1840a45c92627f96cf91cd46bd2f\",\n" +
            "        \"latitude\": 45.06300319094324,\n" +
            "        \"longitude\": 7.679014205932617,\n" +
            "        \"name\": \"Porta Nuova 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.066Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Bava ang. via Cesare Balbo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"4881a69c1d531ca10fe33f067806a36a\",\n" +
            "        \"latitude\": 45.069083725552034,\n" +
            "        \"longitude\": 7.701942043896679,\n" +
            "        \"name\": \"Bava\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.067Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Inghilterra 21\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"cc8c24f38d0f00d7fb69897c1ea66bd9\",\n" +
            "        \"latitude\": 45.07280839324679,\n" +
            "        \"longitude\": 7.665688991546631,\n" +
            "        \"name\": \"Inghilterra 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.07Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Solferino 20\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"33c0c23b9afc876815f7bc01af153b03\",\n" +
            "        \"latitude\": 45.068112487102646,\n" +
            "        \"longitude\": 7.676173746585846,\n" +
            "        \"name\": \"Solferino 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.072Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 15,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Meucci fr. civ. 2 ang. V. Confienza\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"93cc68b058bc0ea16b730c0d8254a460\",\n" +
            "        \"latitude\": 45.06919794059523,\n" +
            "        \"longitude\": 7.676246166229248,\n" +
            "        \"name\": \"Meucci\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.072Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Matteotti 12a ang. c.so Re Umberto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"937051dc39cd2b869dfb14c0c9ec2e21\",\n" +
            "        \"latitude\": 45.066299563317294,\n" +
            "        \"longitude\": 7.674856781959534,\n" +
            "        \"name\": \"Matteotti 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.073Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"p.za Paleocapa\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"0e2318bc0b4a9ba37e83407dbdab15e6\",\n" +
            "        \"latitude\": 45.064102002854284,\n" +
            "        \"longitude\": 7.678874731063843,\n" +
            "        \"name\": \"Paleocapa\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.074Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Matteotti ang. via Avogadro\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"32ba97a470322f9c24e302cd33e4ec14\",\n" +
            "        \"latitude\": 45.06790600234207,\n" +
            "        \"longitude\": 7.670302391052246,\n" +
            "        \"name\": \"Matteotti 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.076Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 15,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Matteotti ang. c.so Vinzaglio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"7a923dcd39517c945a38d09f86039a32\",\n" +
            "        \"latitude\": 45.06880013280763,\n" +
            "        \"longitude\": 7.667759656906128,\n" +
            "        \"name\": \"Matteotti 3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.08Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Galileo Ferraris ang. Via San Quintino\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"033bf4115ad956b7af02f5f99f21c1d7\",\n" +
            "        \"latitude\": 45.06677695321383,\n" +
            "        \"longitude\": 7.67146110534668,\n" +
            "        \"name\": \"Galileo Ferraris 5\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.082Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Grattoni ang. c.so Bolzano\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"2e5d34729aa799ddd19a8874bfb6da6d\",\n" +
            "        \"latitude\": 45.071406255932246,\n" +
            "        \"longitude\": 7.666748581009983,\n" +
            "        \"name\": \"Bolzano\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.085Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vittorio Emanuele II 100 ang. c.so Vinzaglio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"cf5fbbe91a07a1503d225a7a3621c40b\",\n" +
            "        \"latitude\": 45.067519551794994,\n" +
            "        \"longitude\": 7.665849924087524,\n" +
            "        \"name\": \"Vittorio Emanuele II 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.086Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 15,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Nizza ang. c.so Sommelier\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"e6a3c1f73b1e39d4f5ba3924ca807e95\",\n" +
            "        \"latitude\": 45.05416645982046,\n" +
            "        \"longitude\": 7.6755595207214355,\n" +
            "        \"name\": \"Nizza 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.086Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Vittorio Emanuele II 75 ang. c.so Re Umberto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 16,\n" +
            "        \"id\": \"4f2b192217e2894d53f71b2065026767\",\n" +
            "        \"latitude\": 45.064454375994714,\n" +
            "        \"longitude\": 7.674325704574585,\n" +
            "        \"name\": \"Vittorio Emanuele II 3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.087Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vittorio Emanuele II  lato p.zza Carlo Felice\"\n" +
            "        },\n" +
            "        \"free_bikes\": 18,\n" +
            "        \"id\": \"88cfc47b6970baabea2458af8fcc305b\",\n" +
            "        \"latitude\": 45.062897097640715,\n" +
            "        \"longitude\": 7.679271697998047,\n" +
            "        \"name\": \"Porta Nuova 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.088Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Padova ang. c.so Regio Parco\"\n" +
            "        },\n" +
            "        \"free_bikes\": 13,\n" +
            "        \"id\": \"022da4126aa36e2f187a75fc0581eca0\",\n" +
            "        \"latitude\": 45.079036172122585,\n" +
            "        \"longitude\": 7.698583602905273,\n" +
            "        \"name\": \"Padova\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.09Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Lagrange\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"7a2d2189b2c77bf77cf48728e207c486\",\n" +
            "        \"latitude\": 45.06341619513875,\n" +
            "        \"longitude\": 7.680872976779938,\n" +
            "        \"name\": \"Lagrange\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.091Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 14,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Giordano Bruno fr. via Ardigo`\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"ed1c958ce3ac37df7d1e646fcf00fa6f\",\n" +
            "        \"latitude\": 45.04410032041803,\n" +
            "        \"longitude\": 7.663983106613159,\n" +
            "        \"name\": \"Giordano Bruno\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.094Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Gobetti, 1 ang. Via Teofilo Rossi\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"74d0102b3ec34076c011a8e21a9d8c28\",\n" +
            "        \"latitude\": 45.06608050917409,\n" +
            "        \"longitude\": 7.682219209463597,\n" +
            "        \"name\": \"CLN\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.096Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Arcivescovado ang. via Arsenale\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"9f1a73de0b1c36f9d40c771335fe3906\",\n" +
            "        \"latitude\": 45.06701943544395,\n" +
            "        \"longitude\": 7.6783061027526855,\n" +
            "        \"name\": \"Arcivescovado\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.103Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Giolitti ang. via Lagrange\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"8341acb6670a6aee0d7e63cfca3ff152\",\n" +
            "        \"latitude\": 45.06646505054477,\n" +
            "        \"longitude\": 7.683661700645644,\n" +
            "        \"name\": \"Giolitti 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.104Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Dante ang. v. Madama Cristina\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"5ddfdcc1a26f93a88b4561ccd20eb3b5\",\n" +
            "        \"latitude\": 45.047329561139506,\n" +
            "        \"longitude\": 7.675881385803223,\n" +
            "        \"name\": \"Madama Cristina\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.105Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via XX Settembre 60 ang. via Bertola\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"1e75e19871a84230f63a298e9f84346a\",\n" +
            "        \"latitude\": 45.06971603372952,\n" +
            "        \"longitude\": 7.682255655527115,\n" +
            "        \"name\": \"Bertola\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.111Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Lione ang. c.so Ferrucci\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"eba18c41ca377bb82d12427268c654dc\",\n" +
            "        \"latitude\": 45.05982788473085,\n" +
            "        \"longitude\": 7.656440734863281,\n" +
            "        \"name\": \"Lione\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.112Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 12,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via I Maggio ang. via Luzio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"22c5f7879529b068f8b5cc957c64c290\",\n" +
            "        \"latitude\": 45.07140108498241,\n" +
            "        \"longitude\": 7.688130303282605,\n" +
            "        \"name\": \"Castello 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.113Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"corso Duca degli Abruzzi angolo corso Stati Uniti\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"3ab15eeb9edc09a6c6594bfde93194b8\",\n" +
            "        \"latitude\": 45.064973459352615,\n" +
            "        \"longitude\": 7.664637565612793,\n" +
            "        \"name\": \"Stati Uniti 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.115Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 16,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Castello area taxi\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"7834c76b788db0c7f9bc130bc2dcedd4\",\n" +
            "        \"latitude\": 45.07021918496116,\n" +
            "        \"longitude\": 7.686540283735326,\n" +
            "        \"name\": \"Castello 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.117Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Regina Margherita ang. c.so Regio Parco\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"26bc819b3c2d41e510727b40d60fb782\",\n" +
            "        \"latitude\": 45.074619216454415,\n" +
            "        \"longitude\": 7.690161466598511,\n" +
            "        \"name\": \"Regina Margherita 4\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.118Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so San Maurizio 23 ang. via Rossini\"\n" +
            "        },\n" +
            "        \"free_bikes\": 16,\n" +
            "        \"id\": \"2efd70416b5b3b30866eb969f219e5b3\",\n" +
            "        \"latitude\": 45.07194441005202,\n" +
            "        \"longitude\": 7.6926009356975555,\n" +
            "        \"name\": \"San Maurizio\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.119Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Verdi ang. v. Rossini\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"2d194b226c679c1a5925fbeff503b46a\",\n" +
            "        \"latitude\": 45.0689592562549,\n" +
            "        \"longitude\": 7.6910412311553955,\n" +
            "        \"name\": \"RAI\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.12Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 13,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Marconi ang. via Nizza\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"1dd287d6cbee79d6e3bd5a9d531ced58\",\n" +
            "        \"latitude\": 45.05732692276085,\n" +
            "        \"longitude\": 7.676997184753418,\n" +
            "        \"name\": \"Nizza 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.121Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Sant`Ottavio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 8,\n" +
            "        \"id\": \"a3d05c72e63f76c832d7d6ccbf4f5fd5\",\n" +
            "        \"latitude\": 45.06846672986258,\n" +
            "        \"longitude\": 7.69443154335022,\n" +
            "        \"name\": \"Universita` 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.121Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"p.za De Amicis 125\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"cd97b0ac8ce5d0b6792c7422510cf626\",\n" +
            "        \"latitude\": 45.04674929679072,\n" +
            "        \"longitude\": 7.673059075725632,\n" +
            "        \"name\": \"De Amicis\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.122Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via San Francesco da Paola ang. v. Po\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"cb0c07409ecc108c6f8d8a4ebd62d68a\",\n" +
            "        \"latitude\": 45.06860276449712,\n" +
            "        \"longitude\": 7.689076481303573,\n" +
            "        \"name\": \"San Francesco da Paola\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.124Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Carlo Alberto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"7c35ff96c38504cba80c629c7e49617b\",\n" +
            "        \"latitude\": 45.0680387843125,\n" +
            "        \"longitude\": 7.686654723323272,\n" +
            "        \"name\": \"Carlo Alberto\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.124Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Raffaello ang. c.so M. d`Azeglio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"cd4d46a638a1f8e18cca7afae2c0f870\",\n" +
            "        \"latitude\": 45.050427868982325,\n" +
            "        \"longitude\": 7.681269943714142,\n" +
            "        \"name\": \"Torino Esposizioni\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.125Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Carlo Emanuele lato v. de Ambrois\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"e1e0e964fa1d00f99c5d57542fcde36a\",\n" +
            "        \"latitude\": 45.06678642519523,\n" +
            "        \"longitude\": 7.68892228603363,\n" +
            "        \"name\": \"Piazza Carlina\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.126Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via San Francesco da Paola 28\"\n" +
            "        },\n" +
            "        \"free_bikes\": 9,\n" +
            "        \"id\": \"6af4b1358299a1f200a14e7298fb6643\",\n" +
            "        \"latitude\": 45.06458698897965,\n" +
            "        \"longitude\": 7.686256170272827,\n" +
            "        \"name\": \"Valdo Fusi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.127Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Cavour ang. v. S. Massimo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 9,\n" +
            "        \"id\": \"43303e15a7af6712542939953a33f5bc\",\n" +
            "        \"latitude\": 45.06314717439604,\n" +
            "        \"longitude\": 7.68879622220993,\n" +
            "        \"name\": \"Giardini Cavour\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.127Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Bodoni\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"30da0d2ffefa2cf6a1d8fefb878c0740\",\n" +
            "        \"latitude\": 45.063351781836765,\n" +
            "        \"longitude\": 7.684204280376434,\n" +
            "        \"name\": \"Bodoni\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.128Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vittorio Emanuele II ang. v. P. Tommaso\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"a66cdf43c47ab67717c249e80328e0ec\",\n" +
            "        \"latitude\": 45.06083771185658,\n" +
            "        \"longitude\": 7.683788537979126,\n" +
            "        \"name\": \"Vittorio Emanuele II 5\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.129Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 14,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Largo Orbassano ang. c.so Rosselli\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"a4ec496a6173afcff29f0317b64a29f3\",\n" +
            "        \"latitude\": 45.053075036360624,\n" +
            "        \"longitude\": 7.655791640281677,\n" +
            "        \"name\": \"Orbassano\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.13Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Giolitti ang. via delle Rosine\"\n" +
            "        },\n" +
            "        \"free_bikes\": 14,\n" +
            "        \"id\": \"0a6330c43c20c909001685ddf37ca48e\",\n" +
            "        \"latitude\": 45.06409442491343,\n" +
            "        \"longitude\": 7.690494060516357,\n" +
            "        \"name\": \"Giolitti 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.13Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Maria Vittoria 40\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"3986db5921de12faeb0fe7bec603720e\",\n" +
            "        \"latitude\": 45.06514774905812,\n" +
            "        \"longitude\": 7.692280411720276,\n" +
            "        \"name\": \"Maria Vittoria\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.131Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Plana ang. p.zza Vittorio Veneto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 13,\n" +
            "        \"id\": \"19b8fecf43949e7983464715a42843b8\",\n" +
            "        \"latitude\": 45.065204582542854,\n" +
            "        \"longitude\": 7.693742215633392,\n" +
            "        \"name\": \"Vittorio Veneto 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.132Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Cairoli ang. lungo Po Diaz\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"d252eb299c1889e3b93ff512c4b9e39f\",\n" +
            "        \"latitude\": 45.06217717360132,\n" +
            "        \"longitude\": 7.694056034088135,\n" +
            "        \"name\": \"Murazzi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.133Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Massimo d`Azeglio ang. c.so Vittorio Emanuele II\"\n" +
            "        },\n" +
            "        \"free_bikes\": 14,\n" +
            "        \"id\": \"e4411b9fdb07742fa4154cde367f25e8\",\n" +
            "        \"latitude\": 45.05919128660793,\n" +
            "        \"longitude\": 7.6879459619522095,\n" +
            "        \"name\": \"Valentino 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.133Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Castelfidardo fr. O.G.R.\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"ca7836f68c81acdfca147d39cf65116d\",\n" +
            "        \"latitude\": 45.06673148768116,\n" +
            "        \"longitude\": 7.661869525909424,\n" +
            "        \"name\": \"O.G.R.\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.134Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Moncalieri ang. Ponte Umberto I\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"2cca020a278f2cd56ca7581e18083fe8\",\n" +
            "        \"latitude\": 45.05802417164069,\n" +
            "        \"longitude\": 7.693557143211365,\n" +
            "        \"name\": \"Fiume\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.137Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Gran Madre lato c.so Casale\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"8353d3bd1c05ed80020d556869f03f08\",\n" +
            "        \"latitude\": 45.06291225383885,\n" +
            "        \"longitude\": 7.6985567808151245,\n" +
            "        \"name\": \"Gran Madre\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.139Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 16,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Sant`Anselmo ang. via Berthollet\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"55a8cea30652b24b4a87035c013fd125\",\n" +
            "        \"latitude\": 45.060009768606974,\n" +
            "        \"longitude\": 7.681645452976227,\n" +
            "        \"name\": \"SantÂ´Anselmo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.141Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Marconi ang. via Ormea\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"757440e85510a3c6c6b83e455bf6ab33\",\n" +
            "        \"latitude\": 45.055386707220094,\n" +
            "        \"longitude\": 7.68269419670105,\n" +
            "        \"name\": \"Marconi 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.142Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Belfiore ang. v. Morgari\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"cdb2cce505c174d371c8d29f63fdac24\",\n" +
            "        \"latitude\": 45.05423887358317,\n" +
            "        \"longitude\": 7.678398478645363,\n" +
            "        \"name\": \"Belfiore\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.143Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Principe Tommaso ang. via Baretti\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"854c87f0eb5fd195f280a7dbc61fa39a\",\n" +
            "        \"latitude\": 45.05764661752597,\n" +
            "        \"longitude\": 7.681248253612239,\n" +
            "        \"name\": \"Baretti\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.144Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Carrara\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"20b7061dc73f36e7cf5124364e441884\",\n" +
            "        \"latitude\": 45.069197004608924,\n" +
            "        \"longitude\": 7.720410657258071,\n" +
            "        \"name\": \"Carrara\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.145Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 4,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Belgio int. 86\"\n" +
            "        },\n" +
            "        \"free_bikes\": 16,\n" +
            "        \"id\": \"474ebf1a9f3bd0b94bbd1edcf4f31329\",\n" +
            "        \"latitude\": 45.073007283537905,\n" +
            "        \"longitude\": 7.717235684394836,\n" +
            "        \"name\": \"Belgio 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.145Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 20,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Galileo Ferrais 32 ang. c.so Stati Uniti\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"78588808309cc54bf936b7647a62e0a7\",\n" +
            "        \"latitude\": 45.063662480624224,\n" +
            "        \"longitude\": 7.669433355331421,\n" +
            "        \"name\": \"Galileo Ferraris 4\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.146Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Re Umberto ang. v. Pastrengo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"df963d3539d3f65eff3099985435361c\",\n" +
            "        \"latitude\": 45.05966115733609,\n" +
            "        \"longitude\": 7.670677900314331,\n" +
            "        \"name\": \"Re Umberto\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.147Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Re Umberto ang. via Giambattista Vico\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"e09adbc4d826e96f6c7e169614203ce1\",\n" +
            "        \"latitude\": 45.056038505721226,\n" +
            "        \"longitude\": 7.668092250823975,\n" +
            "        \"name\": \"Re Umberto 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.148Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Galileo Ferraris ang. via Colombo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"3ca8e1aa2c9f67c01d606ebe5b6d1c27\",\n" +
            "        \"latitude\": 45.05663724430915,\n" +
            "        \"longitude\": 7.664337158203125,\n" +
            "        \"name\": \"Galileo Ferraris 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.149Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Duca degli Abruzzi ang. C.so Duca d`Aosta\"\n" +
            "        },\n" +
            "        \"free_bikes\": 8,\n" +
            "        \"id\": \"bc3de40b9caf664e11777df7d8ef92c0\",\n" +
            "        \"latitude\": 45.0624689333835,\n" +
            "        \"longitude\": 7.663130164146423,\n" +
            "        \"name\": \"Politecnico 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.15Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Duca degli Abruzzi / C.so Peschiesca area Car Sharing\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"1f88becd388f54a51c842599f89a8ef4\",\n" +
            "        \"latitude\": 45.060729719938735,\n" +
            "        \"longitude\": 7.6612794399261475,\n" +
            "        \"name\": \"Politecnico 3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.151Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Castelfidardo 39\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"14ec1cf2e6948f5188cb254735cbd5a2\",\n" +
            "        \"latitude\": 45.06379130645553,\n" +
            "        \"longitude\": 7.660024166107178,\n" +
            "        \"name\": \"Politecnico 4\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.152Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Cavalli ang. via Falcone\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"8d905cb233d02886d288c0185f870832\",\n" +
            "        \"latitude\": 45.07084597193492,\n" +
            "        \"longitude\": 7.6612794399261475,\n" +
            "        \"name\": \"Tribunale\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.152Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 13,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Principi d`Acaja fr. civ. 47\"\n" +
            "        },\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"e0442e225f55cfd594f3494eed26b383\",\n" +
            "        \"latitude\": 45.073067897584245,\n" +
            "        \"longitude\": 7.662143111228943,\n" +
            "        \"name\": \"Principi d`Acaja 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.153Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Francia ang. v. Principi d`Acaja\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"bfd87240403e179f72d70230e20ee898\",\n" +
            "        \"latitude\": 45.07627087963581,\n" +
            "        \"longitude\": 7.664541006088257,\n" +
            "        \"name\": \"Principi d`Acaja 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.154Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Bernini\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"a87ae87d44ff6d51dc8d60019348753c\",\n" +
            "        \"latitude\": 45.076145826956605,\n" +
            "        \"longitude\": 7.6555578970445595,\n" +
            "        \"name\": \"Bernini\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.155Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Vittorio Emanuele II ang. c.so Ferrucci\"\n" +
            "        },\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"e4119af54a9442457342ac71a6cf3ac7\",\n" +
            "        \"latitude\": 45.07062110247979,\n" +
            "        \"longitude\": 7.655974196079228,\n" +
            "        \"name\": \"Adriano\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.155Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so De Gasperi fr. civ. 24\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"9308a26d3b094dd3db5e39f049067c24\",\n" +
            "        \"latitude\": 45.057099557157436,\n" +
            "        \"longitude\": 7.661263346672058,\n" +
            "        \"name\": \"De Gasperi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.156Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Regina Margherita fr. via Tarino\"\n" +
            "        },\n" +
            "        \"free_bikes\": 9,\n" +
            "        \"id\": \"1ec2aef864a2468e32ab11b283a23aa4\",\n" +
            "        \"latitude\": 45.072346207421,\n" +
            "        \"longitude\": 7.697124481201172,\n" +
            "        \"name\": \"Regina Margherita 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.157Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Lungo Dora Firenze ang. Ponte Bologna\"\n" +
            "        },\n" +
            "        \"free_bikes\": 15,\n" +
            "        \"id\": \"0a8605833d7a3d6ebf5895cde756b047\",\n" +
            "        \"latitude\": 45.07942670291721,\n" +
            "        \"longitude\": 7.689201884735439,\n" +
            "        \"name\": \"Dora Firenze\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.157Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Raffaello 19 ang. via Madama Cristina\"\n" +
            "        },\n" +
            "        \"free_bikes\": 8,\n" +
            "        \"id\": \"e728b6188fee470b42cfb0f199deda27\",\n" +
            "        \"latitude\": 45.05155155628596,\n" +
            "        \"longitude\": 7.678359746932983,\n" +
            "        \"name\": \"Raffaello\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.158Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Regio Parco ang. via Parma\"\n" +
            "        },\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"aec66b486d43a8bbeb6f4babfc490e69\",\n" +
            "        \"latitude\": 45.076884558837364,\n" +
            "        \"longitude\": 7.694297432899475,\n" +
            "        \"name\": \"Regio Parco\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.159Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Lungo Po Cadorna ang. c.so San Maurizio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"ea2467a67e9cddb269ccd9aef53b079a\",\n" +
            "        \"latitude\": 45.065500115752634,\n" +
            "        \"longitude\": 7.698733806610107,\n" +
            "        \"name\": \"Lungo Po Cadorna\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.16Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so San Maurizio ang. v. Giulia di Barolo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 12,\n" +
            "        \"id\": \"87b62141bf8297b1b4e5b4bfe52c5cac\",\n" +
            "        \"latitude\": 45.06749681932851,\n" +
            "        \"longitude\": 7.696802616119385,\n" +
            "        \"name\": \"Giulia di Barolo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.16Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Regina Margherita fr. Osp. Gradenigo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"01ac11c4de440dd1b6ebe47534c269e5\",\n" +
            "        \"latitude\": 45.06959195700802,\n" +
            "        \"longitude\": 7.705841660499573,\n" +
            "        \"name\": \"Regina Margherita 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.161Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.o Regina Margherita ang. via Denina\"\n" +
            "        },\n" +
            "        \"free_bikes\": 15,\n" +
            "        \"id\": \"f56421016e5c525b4a28aa9c04b49346\",\n" +
            "        \"latitude\": 45.073641833649226,\n" +
            "        \"longitude\": 7.69268274307251,\n" +
            "        \"name\": \"Regina Margherita 3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.162Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Lungo Dora Siena 104\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"b0a83522b9bede43f5154ff2a2551532\",\n" +
            "        \"latitude\": 45.074907144569174,\n" +
            "        \"longitude\": 7.702237584503678,\n" +
            "        \"name\": \"Dora Siena 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.163Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Casale ang. Ponte Regina Margherita\"\n" +
            "        },\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"2686d47d216947c7fdf91474819d6054\",\n" +
            "        \"latitude\": 45.067183585022626,\n" +
            "        \"longitude\": 7.708355138094134,\n" +
            "        \"name\": \"Borromini\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.163Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Dante 53 ang. V. Nizza\"\n" +
            "        },\n" +
            "        \"free_bikes\": 8,\n" +
            "        \"id\": \"d9989a5381f01f08f5f4ecb8c7d4abc3\",\n" +
            "        \"latitude\": 45.047626205054186,\n" +
            "        \"longitude\": 7.67270805511032,\n" +
            "        \"name\": \"Dante\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.164Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 13,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Rosselli ang. c.so Turati\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"ab279b63d689bed88de1a17693d2c3f6\",\n" +
            "        \"latitude\": 45.0501379427056,\n" +
            "        \"longitude\": 7.665420770645142,\n" +
            "        \"name\": \"Mauriziano 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.165Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Re Umberto ang. c.so Rosselli\"\n" +
            "        },\n" +
            "        \"free_bikes\": 9,\n" +
            "        \"id\": \"830efaa8346926a8448a231d6028067c\",\n" +
            "        \"latitude\": 45.05171072774451,\n" +
            "        \"longitude\": 7.663371562957764,\n" +
            "        \"name\": \"Mauriziano 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.165Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Montelungo ang. c.so Galileo Ferraris\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"2f7211e1e71be5137f7fc1cc54b76c54\",\n" +
            "        \"latitude\": 45.04813305280822,\n" +
            "        \"longitude\": 7.658500671386719,\n" +
            "        \"name\": \"Piazza d`Armi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.166Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Vittorio Emanuele II ang. via Carlo Alberto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 8,\n" +
            "        \"id\": \"a6af5985580412fed03798a6a3765d39\",\n" +
            "        \"latitude\": 45.06188920144718,\n" +
            "        \"longitude\": 7.681868076324463,\n" +
            "        \"name\": \"Vittorio Emanuele II 4\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.168Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Duca degli Abruzzi 29\"\n" +
            "        },\n" +
            "        \"free_bikes\": 15,\n" +
            "        \"id\": \"c07a9dfe6696ab4cac15556896908412\",\n" +
            "        \"latitude\": 45.062359050003955,\n" +
            "        \"longitude\": 7.662513256072998,\n" +
            "        \"name\": \"Politecnico 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.169Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"viale Mattioli  - Valentino\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"5ac7801a46364292ee3995b3ade01952\",\n" +
            "        \"latitude\": 45.05490164304878,\n" +
            "        \"longitude\": 7.685462236404419,\n" +
            "        \"name\": \"Valentino 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.17Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Ferrucci ang. v. Boggio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"6f4b8aa6a942a00964e19a2871c1e9fe\",\n" +
            "        \"latitude\": 45.063874664191665,\n" +
            "        \"longitude\": 7.655818462371826,\n" +
            "        \"name\": \"Ferrucci\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.171Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Turati ang. via Camogli\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"3efb6dc2caf480a9a866b8245bf5561e\",\n" +
            "        \"latitude\": 45.04796629131455,\n" +
            "        \"longitude\": 7.663843631744385,\n" +
            "        \"name\": \"Turati\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.171Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 15,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Piazza Carducci 76\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"dae488ecb68f137f60ba8ba652b4ca04\",\n" +
            "        \"latitude\": 45.04256598342795,\n" +
            "        \"longitude\": 7.670896924579097,\n" +
            "        \"name\": \"Carducci\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.172Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Corso Bramante 73 ang. p.zza Carducci\"\n" +
            "        },\n" +
            "        \"free_bikes\": 18,\n" +
            "        \"id\": \"3414d080023cebbea3a908927270081f\",\n" +
            "        \"latitude\": 45.042417404409754,\n" +
            "        \"longitude\": 7.673242092132568,\n" +
            "        \"name\": \"Molinette 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.173Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"C.so Massimo ang. via Cellini\"\n" +
            "        },\n" +
            "        \"free_bikes\": 14,\n" +
            "        \"id\": \"81a2a8dc4259577e87a0ce15f09ff782\",\n" +
            "        \"latitude\": 45.042705474625635,\n" +
            "        \"longitude\": 7.677469253540039,\n" +
            "        \"name\": \"Molinette 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.173Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Galileo Ferraris ang. via Valeggio\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"3a8b20e202973c3388dfe804f5a13e37\",\n" +
            "        \"latitude\": 45.05960810760855,\n" +
            "        \"longitude\": 7.6669228076934814,\n" +
            "        \"name\": \"Galileo Ferraris 3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.174Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 22,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Castelfidardo ang. c.so Vittorio Emanuele II\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"3f07426ae5c0ea43a8feae264c10bf0d\",\n" +
            "        \"latitude\": 45.06823940855777,\n" +
            "        \"longitude\": 7.662481069564819,\n" +
            "        \"name\": \"Castelfidardo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.176Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Livorno 48\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"851303515a8f2fd76e51e0a609d1e4d9\",\n" +
            "        \"latitude\": 45.08711915014503,\n" +
            "        \"longitude\": 7.6697927713394165,\n" +
            "        \"name\": \"Livorno\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.179Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Umbria 16 ang. via Macerata\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"156382e82518f8d4213e0a5c6ced57a7\",\n" +
            "        \"latitude\": 45.08330885406793,\n" +
            "        \"longitude\": 7.669315338134766,\n" +
            "        \"name\": \"Umbria\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.179Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Livorno - Parco Dora\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"7e96f731b9be24aa6809d4f086a8c68e\",\n" +
            "        \"latitude\": 45.0870055267019,\n" +
            "        \"longitude\": 7.669347524642944,\n" +
            "        \"name\": \"Livorno 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.18Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Richelmy ang. via Ventimiglia\"\n" +
            "        },\n" +
            "        \"free_bikes\": 14,\n" +
            "        \"id\": \"098a85a8a39b9fe8acc62aff20f3e894\",\n" +
            "        \"latitude\": 45.03265248245964,\n" +
            "        \"longitude\": 7.671568393707275,\n" +
            "        \"name\": \"Ventimiglia\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.181Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"p.za Polonia ang. c.so Spezia\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"43d87906a933d45831102fb24d127f19\",\n" +
            "        \"latitude\": 45.036291778601175,\n" +
            "        \"longitude\": 7.674894332885742,\n" +
            "        \"name\": \"Spezia 1\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.182Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Nizza fr. civico 218\"\n" +
            "        },\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"187826d93c3e51c4ddf0bba53c82dd72\",\n" +
            "        \"latitude\": 45.03591269605153,\n" +
            "        \"longitude\": 7.668671607971191,\n" +
            "        \"name\": \"Nizza 3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.182Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 14,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Nizza 274 - Uscita Metro Lingotto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"4f1f47a0fd8f7638fe76b838a01ee245\",\n" +
            "        \"latitude\": 45.03082895642492,\n" +
            "        \"longitude\": 7.6665472984313965,\n" +
            "        \"name\": \"Lingotto Fiere\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.183Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 4,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Pio VII 78 ang. via Passo Buole\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"ebbdd18012907531ff8d3e71061c0faf\",\n" +
            "        \"latitude\": 45.02513053703223,\n" +
            "        \"longitude\": 7.652170658111572,\n" +
            "        \"name\": \"Pio VII\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.184Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Pio VII 9\"\n" +
            "        },\n" +
            "        \"free_bikes\": 14,\n" +
            "        \"id\": \"35b04951c2165bc1eb926bac1820093a\",\n" +
            "        \"latitude\": 45.02967263642637,\n" +
            "        \"longitude\": 7.654788494110107,\n" +
            "        \"name\": \"Pio VII 2\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.184Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 12,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"p.za Galimberti ang. via Giordano Bruno\"\n" +
            "        },\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"39bf4ae589293add2a6996c1cccdb41d\",\n" +
            "        \"latitude\": 45.03311498918136,\n" +
            "        \"longitude\": 7.6565587520599365,\n" +
            "        \"name\": \"Galimberti\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.185Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"via Filadelfia ang. via Giordano Bruno\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"1e35858171dffe2c7408cf08242ef0c2\",\n" +
            "        \"latitude\": 45.037171240444955,\n" +
            "        \"longitude\": 7.658897638320923,\n" +
            "        \"name\": \"Filadelfia\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.186Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 14,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Sebastopoli ang. via Giordano Bruno\"\n" +
            "        },\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"1b05f5addeb0b7d521e473768f910fbc\",\n" +
            "        \"latitude\": 45.039771639065144,\n" +
            "        \"longitude\": 7.6607054471969604,\n" +
            "        \"name\": \"Sebastopoli\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.187Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Unione Sovietica ang. c.so Giambone\"\n" +
            "        },\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"149739218fc435b5b26799ea76b69b37\",\n" +
            "        \"latitude\": 45.03316806348413,\n" +
            "        \"longitude\": 7.647085189819336,\n" +
            "        \"name\": \"Giambone\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.187Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Galileo Ferraris ang. parco Cavalieri Vittorio Veneto\"\n" +
            "        },\n" +
            "        \"free_bikes\": 11,\n" +
            "        \"id\": \"2dcd8684a310cf5fcd5fe779a1f6cb30\",\n" +
            "        \"latitude\": 45.04223301427509,\n" +
            "        \"longitude\": 7.654679864645004,\n" +
            "        \"name\": \"Galileo Ferraris 6\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.188Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 20,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Unione Sovietica ang. via Montevideo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"c7149e9796d86ca6520e5ca5e78cf5aa\",\n" +
            "        \"latitude\": 45.03711058833795,\n" +
            "        \"longitude\": 7.65148401260376,\n" +
            "        \"name\": \"Montevideo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.189Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 10,\n" +
            "        \"id\": \"4d061bbd664b065900293c31abcdc405\",\n" +
            "        \"latitude\": 45.051296162513296,\n" +
            "        \"longitude\": 7.6741765618323825,\n" +
            "        \"name\": \"Piazza Nizza\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.189Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"f01c3eb11d001cdeb048c5153d2312ae\",\n" +
            "        \"latitude\": 45.04440354326403,\n" +
            "        \"longitude\": 7.617623805999756,\n" +
            "        \"name\": \"Gerbido\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.191Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"bc312c77398b36b68dcc11a936231be8\",\n" +
            "        \"latitude\": 45.067519551794994,\n" +
            "        \"longitude\": 7.563056945800781,\n" +
            "        \"name\": \"Fabbrichetta\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.192Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 8,\n" +
            "        \"id\": \"d5b824f8f0b24055820952cae13d8eb6\",\n" +
            "        \"latitude\": 45.056364402185814,\n" +
            "        \"longitude\": 7.580995559692383,\n" +
            "        \"name\": \"Borgo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.194Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"efb9906681ca572faa6c528c55856187\",\n" +
            "        \"latitude\": 45.06171490180712,\n" +
            "        \"longitude\": 7.581188678741455,\n" +
            "        \"name\": \"Villa Claretta\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.196Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 12,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"6ada4564cfb797b8829b59ec7742e2ed\",\n" +
            "        \"latitude\": 45.06479159126726,\n" +
            "        \"longitude\": 7.588076591491699,\n" +
            "        \"name\": \"Universita`\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.197Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"d38e65d832c8d32a5e9d6547144e35f5\",\n" +
            "        \"latitude\": 45.063139596328625,\n" +
            "        \"longitude\": 7.5768327713012695,\n" +
            "        \"name\": \"Le Serre\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.198Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 1,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 9,\n" +
            "        \"id\": \"ffd596ecd472bfa10fd38a9685f17c8c\",\n" +
            "        \"latitude\": 45.06829245027643,\n" +
            "        \"longitude\": 7.599577903747559,\n" +
            "        \"name\": \"Stazione Ferroviaria Paradiso\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.199Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"22743c60546a6b5713094662d6940f4e\",\n" +
            "        \"latitude\": 45.06566411992803,\n" +
            "        \"longitude\": 7.579057797622681,\n" +
            "        \"name\": \"Lupo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.201Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"a5013cd73813eb8542cbb384895ef483\",\n" +
            "        \"latitude\": 45.058637457278984,\n" +
            "        \"longitude\": 7.620371770777865,\n" +
            "        \"name\": \"Lesna\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.201Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"8c12fcd7311c98e9a948af38caa4d051\",\n" +
            "        \"latitude\": 45.084126990755045,\n" +
            "        \"longitude\": 7.575631141662598,\n" +
            "        \"name\": \"Certosa / P.le Avis\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.202Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 4,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"26a6631b10b148b217942bd7d50e0e13\",\n" +
            "        \"latitude\": 45.07764217839048,\n" +
            "        \"longitude\": 7.58082389831543,\n" +
            "        \"name\": \"Dalla Chiesa / Pastrengo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.203Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"d1bc8033c40ee5264cce8f47d5187fba\",\n" +
            "        \"latitude\": 45.072338630573036,\n" +
            "        \"longitude\": 7.561769485473633,\n" +
            "        \"name\": \"Leumann\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.203Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 4,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"c50124e7cca913343a6cbeba5e4b6cdb\",\n" +
            "        \"latitude\": 45.07373275368509,\n" +
            "        \"longitude\": 7.601809501647949,\n" +
            "        \"name\": \"Metro Paradiso\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.204Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 1,\n" +
            "        \"id\": \"8fa4807880ed26b205517a071dca0c21\",\n" +
            "        \"latitude\": 45.115722339702245,\n" +
            "        \"longitude\": 7.613739967346191,\n" +
            "        \"name\": \"Savonera\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.205Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 11,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"6dfacb8f11c7d84f6a4de5a6c4843a45\",\n" +
            "        \"latitude\": 45.076036013012384,\n" +
            "        \"longitude\": 7.591123580932617,\n" +
            "        \"name\": \"Fermi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.206Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"f1d7621c4f2b581dc95871181eaddf7f\",\n" +
            "        \"latitude\": 45.07894526052452,\n" +
            "        \"longitude\": 7.5743865966796875,\n" +
            "        \"name\": \"Stazione F.S.\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.206Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"f721695d488b071d3df077eb4a9d50bf\",\n" +
            "        \"latitude\": 45.07270231814184,\n" +
            "        \"longitude\": 7.58030891418457,\n" +
            "        \"name\": \"Gramsci\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.207Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"89133cb9d5cfa00e1733665ec0ec7dbc\",\n" +
            "        \"latitude\": 45.07746928803631,\n" +
            "        \"longitude\": 7.569552136909465,\n" +
            "        \"name\": \"Municipio\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.208Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"8d5cc1c49d81c66760c500a922d80b5c\",\n" +
            "        \"latitude\": 45.09064418309555,\n" +
            "        \"longitude\": 7.570132452917505,\n" +
            "        \"name\": \"Europa Unita\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.209Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 4,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"e8242fb035991ef3d83e93fb3b6fa97b\",\n" +
            "        \"latitude\": 45.116903418249365,\n" +
            "        \"longitude\": 7.62300968170166,\n" +
            "        \"name\": \"Concordia\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.21Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"bc2f3dac64e76a022c2869659614a6f5\",\n" +
            "        \"latitude\": 45.129893668868284,\n" +
            "        \"longitude\": 7.631292343139648,\n" +
            "        \"name\": \"Pettiti\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.21Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"aeb1bf0a60459898301e9f798dbc17b7\",\n" +
            "        \"latitude\": 45.12418619577999,\n" +
            "        \"longitude\": 7.632043361663818,\n" +
            "        \"name\": \"C. Commerciale I Portici\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.211Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"7e5a6293440ed4d665c26462cd114ff4\",\n" +
            "        \"latitude\": 45.13532810578641,\n" +
            "        \"longitude\": 7.625691890716553,\n" +
            "        \"name\": \"Reggia\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.212Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 7,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"0c7ddac244be98e27b3249521685e480\",\n" +
            "        \"latitude\": 45.127804527473224,\n" +
            "        \"longitude\": 7.635798454284668,\n" +
            "        \"name\": \"Corso Garibaldi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.213Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"2aad166492e099938af239a535d770e3\",\n" +
            "        \"latitude\": 45.133102925422556,\n" +
            "        \"longitude\": 7.632536888122559,\n" +
            "        \"name\": \"Municipio\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.215Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 6,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 2,\n" +
            "        \"id\": \"a4792b55af4c2ed4730f24207b924ead\",\n" +
            "        \"latitude\": 45.125836425730945,\n" +
            "        \"longitude\": 7.642192840576172,\n" +
            "        \"name\": \"Buozzi\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.216Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 5,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"99d05089c79ad0acfd5d3acecaf2cd83\",\n" +
            "        \"latitude\": 45.12489776867726,\n" +
            "        \"longitude\": 7.6529645919799805,\n" +
            "        \"name\": \"San Marchese\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.217Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 8,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"655591c1d8a7c1c33bc8060028aadc2a\",\n" +
            "        \"latitude\": 45.12031023863353,\n" +
            "        \"longitude\": 7.648565769195557,\n" +
            "        \"name\": \"Rigola\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.218Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 2,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 5,\n" +
            "        \"id\": \"f16cba9c6dc917e833eab7bf3e0168b7\",\n" +
            "        \"latitude\": 45.114828943536864,\n" +
            "        \"longitude\": 7.641313076019287,\n" +
            "        \"name\": \"Gallo Praile\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.218Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"0df8838da4cf2ffe0eaf28629b902dd7\",\n" +
            "        \"latitude\": 45.094383006473215,\n" +
            "        \"longitude\": 7.524325847625732,\n" +
            "        \"name\": \"Municipio\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.219Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 3,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"d6806ba5784a0d60f24f380a9b09a1cb\",\n" +
            "        \"latitude\": 45.099654215224064,\n" +
            "        \"longitude\": 7.531235218048096,\n" +
            "        \"name\": \"Berlinguer\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.22Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 7,\n" +
            "        \"id\": \"8bca5f91b24693d216f576525e7c1647\",\n" +
            "        \"latitude\": 45.136100086850355,\n" +
            "        \"longitude\": 7.576360702514648,\n" +
            "        \"name\": \"Largo Oropa\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.221Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 9,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Montebello 1 bis ang. v. Po\"\n" +
            "        },\n" +
            "        \"free_bikes\": 6,\n" +
            "        \"id\": \"b8c5e6fcf3871886789c356a97161a28\",\n" +
            "        \"latitude\": 45.067693696115334,\n" +
            "        \"longitude\": 7.691806822368562,\n" +
            "        \"name\": \"Universita`3\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.123Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 10,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Porta Palatina\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"add38965bc06683eaa396294006e0d9a\",\n" +
            "        \"latitude\": 45.07405286682691,\n" +
            "        \"longitude\": 7.684102356433868,\n" +
            "        \"name\": \"Porta Palatina\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.062Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 19,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"Via Conte Verde 7 - p.zza IV Marzo\"\n" +
            "        },\n" +
            "        \"free_bikes\": 4,\n" +
            "        \"id\": \"81d625ed4c74d8febd7892c26dc1f3f7\",\n" +
            "        \"latitude\": 45.073291690716154,\n" +
            "        \"longitude\": 7.6822776079118285,\n" +
            "        \"name\": \"IV Marzo\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.063Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 13,\n" +
            "        \"extra\": {\n" +
            "          \"description\": \"c.so Tortona 18/a\"\n" +
            "        },\n" +
            "        \"free_bikes\": 3,\n" +
            "        \"id\": \"7d05992e00a00bb8a7e14e60a816aac2\",\n" +
            "        \"latitude\": 45.07167375825349,\n" +
            "        \"longitude\": 7.7075958251953125,\n" +
            "        \"name\": \"Tortona\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.071Z\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"empty_slots\": 0,\n" +
            "        \"extra\": {},\n" +
            "        \"free_bikes\": 0,\n" +
            "        \"id\": \"b1011cb9791056b04eb1b7b117e959fe\",\n" +
            "        \"latitude\": 45.039230737232025,\n" +
            "        \"longitude\": 7.668394944180363,\n" +
            "        \"name\": \"stazione test - non operativa\",\n" +
            "        \"timestamp\": \"2016-01-06T20:54:20.19Z\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    public JsonParser(String json) {
        this.json = json;
    }

    public JsonParser() {
    }

    public List<Station> getStations() throws JSONException {
        List<Station> ret = new ArrayList<Station>();
        Station s;
        JSONObject j =  new JSONObject(json);
        JSONArray stations = j.getJSONObject("network").getJSONArray("stations");
        JSONObject jsonStation;
        for (int i = 0; i < stations.length(); i++) {
            jsonStation = stations.getJSONObject(i);
            s = new Station(jsonStation);
            ret.add(s);
        }
        return ret;
    }
}
