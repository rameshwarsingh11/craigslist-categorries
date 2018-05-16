Craigslist api to do search and provide results

Complete API documentation can be found here : https://documenter.getpostman.com/view/4362116/craigslist-api-to-do-search-and-provide-results/RW83PXHq

# Introduction
This is a REST based Spring boot API which generates few categories on the fly along with their respective web links in JSON response.

# Overview
The JSON format provides category name and its web link for direct access.

# Authentication
https/SSL Future plan is to integrate PING based Oauth 2.0 authorization.

# Error Codes
404

# Rate limit
As of now there is no limit on the number of requests an user can send. In future enhancements it will be catering 100 simutenous API hits.

# Language
GET http://localhost:8089/categories
GET http://localhost:8089/categories/{categoryName}
Spring boot based REST API to retreive craigslist categories

# Endpoint 1:
curl --request GET \
  --url http://localhost:8089/categories

# Endpoint 2:
curl --request GET \
  --url http://localhost:8089/categories/{categoryName}
