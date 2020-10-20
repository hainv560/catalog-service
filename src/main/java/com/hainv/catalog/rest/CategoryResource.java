package com.hainv.catalog.rest;

import com.hainv.catalog.rest.request.CreateCategoryReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Api(tags = "Category Resource")
@RequestMapping("/categories")
public interface CategoryResource {

    @ApiOperation("Create Category")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created")})
    @PostMapping
    ResponseEntity<?> createCategory(@RequestBody @Valid CreateCategoryReq createCategoryReq);
}
