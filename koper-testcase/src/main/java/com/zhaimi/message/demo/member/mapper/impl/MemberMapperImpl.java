/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhaimi.message.demo.member.mapper.impl;

import com.zhaimi.message.demo.member.mapper.Member;
import com.zhaimi.message.demo.member.mapper.MemberMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author caie
 * @since 1.2
 */
@Repository
public class MemberMapperImpl implements MemberMapper {

    @Override
    public String insertMember(Integer id, String name, String phone) {
        return "on insert Member successful";
    }

    @Override
    public String cancelMember(Integer id, Member member) {
        return "cancel member successful";
    }

    @Override
    public String updateMember(Double id, Long name, BigDecimal account) {
        return "on update member successful";
    }

    @Override
    public String insertWithFloatAndShortAndByteAndChar(Float fl, Short s, Byte b, Character c) {
        return "insert with float and short and byte and char successful";
    }

    @Override
    public String deleteWithIntegerAndStringAndDataEvent(Integer id, String name) {
        return "delete with Integer and String and dataEvent successful";
    }

    @Override
    public String deleteMember(Integer id, String name) {
        return "on delete member successful";
    }

}
