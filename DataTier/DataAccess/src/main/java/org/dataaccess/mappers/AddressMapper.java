package org.dataaccess.mappers;

import org.dataaccess.protobuf.Address;

public abstract class AddressMapper
{
    public static Address mapToProto(org.dataaccess.Shared.Address address)
    {
        return Address.newBuilder()
                .setCountry(address.getCountry())
                .setCity(address.getCity())
                .setZip(address.getZip())
                .setStreet(address.getStreet())
                .build();
    }

    public static org.dataaccess.Shared.Address mapToShared(Address address)
    {
        return new org.dataaccess.Shared.Address(
                address.getCountry(),
                address.getCity(),
                address.getZip(),
                address.getStreet()
        );
    }
}
