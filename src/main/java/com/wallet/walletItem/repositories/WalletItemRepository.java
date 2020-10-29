package com.wallet.walletItem.repositories;

import com.wallet.enums.TypeEnum;
import com.wallet.walletItem.entities.WalletItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface WalletItemRepository extends JpaRepository<WalletItem, Long> {
    Page<WalletItem> findAllByWalletIdAndDateGreaterThanEqualAndDateLessThenEqual(Long wallet, Date init, Date end, Pageable pg);

    List<WalletItem> findByWalletIdAndType(Long wallet, TypeEnum type);
}