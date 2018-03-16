package web;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by SELPHA on 14/3/2018.
 */
@Path("/users")
public class User extends Base{
    @Path("/add")
    //@Produces(APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @POST
    public Response add(@FormParam("name")String name,@FormParam("age") int age){

        Gson gson=new Gson();
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        gson.toJson(student);

        return Response.status(200).entity("my name is"+student.getName()+"and age is"+student.getAge()).build();
    }
    @GET
    @Path("/edit")
    public Response edit(){
        return Response.status(403).entity("Hello stranger.......").build();
    }

}
