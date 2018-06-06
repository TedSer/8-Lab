package ua.lviv.iot;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedHashMap;
import java.util.Map;

@Path("/goods")
public class StoneService {

    static Map<Integer, GoodForMovie> data = new LinkedHashMap<>();

    @GET
    @Path("{id}/")
    @Produces({MediaType.APPLICATION_JSON})
    public GoodForMovie getGem(@PathParam("id") Integer id) {
        System.out.println(data.get(id));
        return data.get(id);
    }


    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    public Response putGood(GoodForMovie goodForMovie) {
        System.out.println("PUT DATA");
        System.out.println(goodForMovie.getCost());
        data.put(goodForMovie.getId(), goodForMovie);
        System.out.println(data.size());
        return Response.accepted().build();
    }

    @DELETE
    @Consumes({MediaType.TEXT_PLAIN})
    public Response deleteGood(Integer id) {
        System.out.println("DELETE DATA AT " + id);


        if (data.remove(id) != null) {
            return Response.ok().build();
        } else {
            return Response.notModified().build();
        }
    }


    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response postGood(GoodForMovie goodForMovie) {
        System.out.println("EDIT DATA AT" + goodForMovie.getBrandType());

        data.replace(goodForMovie.getId(), goodForMovie);

        return Response.accepted().build();
    }


}
