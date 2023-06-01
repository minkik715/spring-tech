package io.github.minkik715.springtech.service.impl

import io.github.minkik715.springtech.domain.dto.request.HouseRequestDto
import io.github.minkik715.springtech.domain.dto.response.HouseResponseDto
import io.github.minkik715.springtech.service.HouseService
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

@Service
class HouseServiceImpl : HouseService {
    override fun getHousePagination(): Page<HouseResponseDto> {
        TODO("Not yet implemented")
    }

    override fun getHouseDetail(houseId: String): HouseResponseDto {
        TODO("Not yet implemented")
    }

    override fun registerHouse(houseRequest: HouseRequestDto): HouseResponseDto {
        TODO("Not yet implemented")
    }

    override fun likeHouse(houseId: String): Long {
        TODO("Not yet implemented")
    }
}