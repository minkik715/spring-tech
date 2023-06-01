package io.github.minkik715.springtech.controller

import io.github.minkik715.springtech.domain.dto.request.HouseRequestDto
import io.github.minkik715.springtech.domain.dto.response.HouseResponseDto
import io.github.minkik715.springtech.service.HouseService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*

@RestController("/api/house")
class HouseController(
    private val houseService : HouseService
) {


    @GetMapping
    fun getHousePagination(): Page<HouseResponseDto> {
        return houseService.getHousePagination()
    }


    @GetMapping("/{houseId}")
    fun getHouseDetail(@PathVariable houseId : String ): HouseResponseDto {
        return houseService.getHouseDetail(houseId)
    }

    @PostMapping
    fun registerHouse(@RequestBody houseRequest : HouseRequestDto) : HouseResponseDto {
        return houseService.registerHouse(houseRequest)
    }

    @PostMapping("/like/{houseId}")
    fun likeHouse(@PathVariable houseId: String) : Long {
        return houseService.likeHouse(houseId)
    }
}