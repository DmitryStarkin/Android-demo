/*
 * Copyright © 2018. Dmitry Starkin Contacts: t0506803080@gmail.com
 *
 * This file is part of weather
 *
 *     weather is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *    weather is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with weather  If not, see <http://www.gnu.org/licenses/>.
 */
package com.hplasplas.weather.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static com.hplasplas.weather.setting.Constants.BASE_URL;

/**
 * Created by StarkinDG on 15.04.2017.
 */

@Module
public class RetrofitModule {
    
    @Provides
    @Singleton
    public Retrofit provideRetrofit(){
       return  new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(ScalarsConverterFactory.create())
               .build();
    }
}
