package com.dx.facade.game.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class VenueWalletRespDto implements Serializable {

    private List<VenueWalletDTO> venueWalletList;

}
