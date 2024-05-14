package co.Develhope.reverseNameApplication;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Reverse name application API")
public class PersonNameController {

    @Operation(summary = "Return value {name}", description = "Return the {name} default value")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successfully retrieved"), @ApiResponse(responseCode = "404", description = "Not found - The product was not found")})
    @GetMapping("/name")
    public String getNormalName(@RequestParam String name) {
        return name;
    }

    @Operation(summary = "Return reverse {name}", description = "Return the {name} reverse value")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successfully retrieved"), @ApiResponse(responseCode = "404", description = "Not found - The product was not found")})
    @PostMapping("/name")
    public String getReverseName(@RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
