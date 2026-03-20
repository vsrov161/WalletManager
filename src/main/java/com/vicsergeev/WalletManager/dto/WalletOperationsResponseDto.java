package com.vicsergeev.WalletManager.dto;

import java.math.BigDecimal;
import java.util.UUID;

/*
 * Created by Vic
 * 20.03.2026
 */
public record WalletOperationsResponseDto(
        UUID walletId,
        BigDecimal balance
) {}
