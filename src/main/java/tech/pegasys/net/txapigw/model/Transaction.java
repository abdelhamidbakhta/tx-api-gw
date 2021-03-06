package tech.pegasys.net.txapigw.model;

import java.math.BigInteger;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
  private BigInteger nonce;

  @Schema(
      example = "0x61aCB88dA0DBA1A43592f7cc548b3319Fa615e1b",
      required = true,
      description = "the recipient address")
  @NotBlank
  @Size(min = 42, max = 42)
  private String to;

  @Schema(example = "1000000", required = true, description = "the amount of ETH to send, in WEI")
  @NotNull
  private BigInteger value;

  @Schema(example = "1000", description = "the gas price of the transaction, in WEI")
  private BigInteger gasPrice;

  @Schema(example = "21000", description = "the gas limit of the transaction")
  @NotNull
  private BigInteger gasLimit;
}
