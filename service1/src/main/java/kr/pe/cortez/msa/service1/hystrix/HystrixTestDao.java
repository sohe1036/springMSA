package kr.pe.cortez.msa.service1.hystrix;

import org.springframework.stereotype.Repository;

import kr.pe.cortez.msa.service1.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class HystrixTestDao {

    public String getIdInfo(String id) {
        System.out.println("Searching from Database ...");

        /** DB 호출 3회중 랜덤 1회 11초 지연 */
        CommonUtil.randomlyRunLong();
        return id + "'s info";
    }
}