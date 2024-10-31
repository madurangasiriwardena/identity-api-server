package org.wso2.carbon.identity.api.expired.password.identification.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.api.expired.password.identification.v1.model.Error;
import org.wso2.carbon.identity.api.expired.password.identification.v1.model.PasswordExpiredUser;
import org.wso2.carbon.identity.api.expired.password.identification.v1.model.Unauthorized;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/password-expired-users")
@Api(description = "the password-expired-users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.9.0")
public class PasswordExpiredUsersApi {

@Autowired
org.wso2.carbon.identity.api.expired.password.identification.v1.impl.PasswordExpiredUsersApiServiceImpl delegate;


    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Get password expired users list for a specified period.<br>    <b>Scope(Permission) required:</b> `internal_password_expired_user_view` ", response = PasswordExpiredUser.class, responseContainer = "List", tags={ "Get password expired users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Password expired users returned successfully", response = PasswordExpiredUser.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Input Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
        @ApiResponse(code = 403, message = "Resource Forbidden", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    })
    public Response getPasswordExpiredUsers(@QueryParam("expiredAfter") @NotNull  @ApiParam("The date after which passwords will expire.")  String expiredAfter,@QueryParam("excludeAfter")  @ApiParam("The date after which should be excluded.")  String excludeAfter) {
        return delegate.getPasswordExpiredUsers(expiredAfter, excludeAfter);
    }
}
