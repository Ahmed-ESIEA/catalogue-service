package com.adeo.dao

import com.adeo.entities.Category
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.Repository

interface CategoryRepository : MongoRepository<Category, String>
