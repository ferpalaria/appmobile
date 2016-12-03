package com.br.fpalaria.aprendendoiot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Fernanda on 02/12/2016.
 */

public interface RetrofitRequest {
@GET("/")
Call<String> validaLogin(@Query("usuario") String usuario, @Query("senha") String senha);




}
