package com.droidorbiter.puppyadoptionchallenge.domain

interface Puppies {

    fun getPuppiesList(): List<PuppiesImp.Puppy>

    fun getPuppyByID(id: String): PuppiesImp.Puppy
}