# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Foot To Meter Conversion Table

# Preset value -1
foot = 0

# Preset value  -6
meter = 14


# Convert from feet to meters
def footToMeter(foot):

    # Convert feet to meters using the given formula
    meter = 0.305 * foot
    return meter


# converts from meters to feet
def meterToFoot(meter):

    # Convert meters to feet using the given formula
    foot = meter / 0.305
    return foot


print(  # Display header
    "Feet     Meters     |     Meters     Feet\n" +
    "----------------------------------------------------------")

# Display data
while foot < 10:
    foot += 1
    meter += 6
    # print results
    print(f"{foot:<10}{round(footToMeter(foot), 3):<10}|{meter:>9}{round(meterToFoot(meter), 3):>13} ")