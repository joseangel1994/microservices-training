package com.microservices.accounts.mapper;

import com.microservices.accounts.dto.AccountsDto;
import com.microservices.accounts.entity.Accounts;
import org.mapstruct.Mapper;

@Mapper
public interface AccountsMapper {
    AccountsDto toDto(Accounts accounts);
    Accounts toEntity(AccountsDto dto);
}
