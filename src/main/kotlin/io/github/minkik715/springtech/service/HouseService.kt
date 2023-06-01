package io.github.minkik715.springtech.service

import io.github.minkik715.springtech.domain.dto.request.HouseRequestDto
import io.github.minkik715.springtech.domain.dto.response.HouseResponseDto
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
interface HouseService {

    fun getHousePagination(): Page<HouseResponseDto>


    fun getHouseDetail(@PathVariable houseId : String ): HouseResponseDto

    fun registerHouse(houseRequest: HouseRequestDto) : HouseResponseDto

    fun likeHouse(houseId : String) : Long
}