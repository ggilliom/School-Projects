def heartbeats(age):
  return age * 525600 * 72

def yawns(age):
  return age * 365 * 5

age = int(input("Enter your age in years: "))
print(heartbeats(age), "heartbeats and", yawns(age), "yawns so far")