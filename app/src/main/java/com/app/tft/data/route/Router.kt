package com.app.tft.data.route

sealed class Router (
    val baseUrl: String
) {
    object BR1: Router(
        baseUrl = "https://br1.api.riotgames.com"
    )

    object EUN1: Router(
        baseUrl = "https://eun1.api.riotgames.com"
    )

    object EUW1: Router(
        baseUrl = "https://euw1.api.riotgames.com"
    )

    object JP1: Router(
        baseUrl = "https://jp1.api.riotgames.com"
    )

    object KR: Router(
        baseUrl = "https://kr.api.riotgames.com"
    )

    object LA1: Router(
        baseUrl = "https://la1.api.riotgames.com"
    )

    object LA2: Router(
        baseUrl = "https://la2.api.riotgames.com"
    )

    object NA1: Router(
        baseUrl = "https://na1.api.riotgames.com"
    )

    object OC1: Router(
        baseUrl = "https://oc1.api.riotgames.com"
    )

    object TR1: Router(
        baseUrl = "https://tr1.api.riotgames.com"
    )

    object RU: Router(
        baseUrl = "https://ru1.api.riotgames.com"
    )

    companion object {
        fun fromIndex(index: RouterEnum): Router {
            return when (index) {
                RouterEnum.BR1 -> BR1
                RouterEnum.EUN1 -> EUN1
                RouterEnum.EUW1 -> EUW1
                RouterEnum.JP1 -> JP1
                RouterEnum.KR -> KR
                RouterEnum.LA1 -> LA1
                RouterEnum.LA2 -> LA2
                RouterEnum.NA1 -> NA1
                RouterEnum.OC1 -> OC1
                RouterEnum.TR1 -> TR1
                else -> RU
            }
        }
    }
}