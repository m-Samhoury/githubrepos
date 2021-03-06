package com.moustafasamhoury.githubchallenge.repository.network

import com.moustafasamhoury.githubchallenge.models.GithubErrorResponse
import com.moustafasamhoury.githubchallenge.models.GithubRepoList
import com.moustafasamhoury.githubchallenge.utils.NetworkResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * This is the Github service that will include all the network calls that will be done with the
 * github service
 *
 * @author moustafasamhoury
 * created on Wednesday, 01 May, 2019
 */
interface RetrofitGithubService {

    @GET("search/repositories")
    fun topGithubRepositories(
        @Query("q") createdAfterDate: String,
        @Query("sort") sort: String = "stars",
        @Query("order") order: String = "desc",
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ): Single<NetworkResponse<GithubRepoList, GithubErrorResponse>>


}