package com.vicsergeev.WalletManager.dto;

import com.vicsergeev.WalletManager.model.OperationType;

import java.math.BigDecimal;
import java.util.UUID;

/*
 * Created by Vic
 * 20.03.2026
 */
public record WalletOperationRequestDto(
        UUID walletId,
        BigDecimal balance,
        OperationType operationType
) {}
